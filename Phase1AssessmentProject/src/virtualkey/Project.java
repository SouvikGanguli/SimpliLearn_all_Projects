package virtualkey;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Project {
	static String DIRECTORY;
    File folder_name;

    public Project() {
        DIRECTORY = System.getProperty("user.dir");
        folder_name = new File(DIRECTORY+"/files");
        if (!folder_name.exists())
            folder_name.mkdirs();
        System.out.println("DIRECTORY : "+ folder_name.getAbsolutePath());
    }

    private static final String WELCOMEPart = " ***WELCOME TO LOCK ME APPLICATION*** \n ";
    

    private static final String MainMenu =
            " MAIN MENU - Select any of the following: \n"+
                    "1 - Retrive files in ascending\n"+
                    "2 - Business Level Operations on files\n"+
                    "3 - Exit Program";

    private static final String Menu =
            "   \nSelect any of the following: \n"+
                    "   a -> Add a file\n"+
                    "   b -> Delete a file\n"+
                    "   c -> Search a file\n"+
                    "   d -> Main menu\n";

    void st1() {
        System.out.println(MainMenu);
        try{
            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();
            switch (select){
                case 1 : 
                {
                    display();
                    st1();
                }
                case 2 : 
                {
                    st2();
                }
                case 3 : 
                {
                    System.out.println("Thank You");
                    System.exit(0);
                }
                default: st1();
            }
        }
        catch (Exception e){
            System.out.println("Please enter 1, 2 or 3");
            st1();
        }
    }

    void st2() {
        System.out.println(Menu);
        try{
            Scanner scanner = new Scanner(System.in);
            char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
            char option = input[0];

            switch (option){
                case 'a' : {
                    System.out.print(" Adding a file...Please Enter a File Name : ");
                    String filename = scanner.next().trim().toLowerCase();
                    addFile(filename);
                    break;
                }
                case 'b' : {
                    System.out.print(" Deleting a file...Please Enter a File Name : ");
                    String filename = scanner.next().trim();
                    deleteFile(filename);
                    break;
                }
                case 'c' : {
                    System.out.print(" Searching a file...Please Enter a File Name : ");
                    String filename = scanner.next().trim();
                    searchingFile(filename);
                    break;
                }
                case 'd' : {
                    System.out.println("Going Back to MAIN menu");
                    st1();
                    break;
                }
                default : System.out.println("Please enter a, b, c or d");
            }
            st2();
        }
        catch (Exception e){
            System.out.println("Please enter a, b, c or d");
            st2();
        }
    }

    void display() {
        if (folder_name.list().length==0)
            System.out.println("The folder is empty");
        else {
            String[] list = folder_name.list();
            System.out.println("The files in "+ folder_name +" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }

    void addFile(String filename) throws IOException {
        File filepath = new File(folder_name +"/"+filename);
        String[] list = folder_name.list();
        for (String file: list) {
            if (filename.equalsIgnoreCase(file)) {
                System.out.println("File " + filename + " already exists at " + folder_name);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+filename+" added to "+ folder_name);
    }

    void deleteFile(String filename) {
        File filepath = new File(folder_name +"/"+filename);
        String[] list = folder_name.list();
        for (String file: list) {
            if (filename.equals(file) && filepath.delete()) {
                System.out.println("File " + filename + " deleted from " + folder_name);
                return;
            }
        }
        System.out.println("Delete Operation failed. FILE NOT FOUND");
    }

    void searchingFile(String filename) {
        String[] list = folder_name.list();
        for (String file: list) {
            if (filename.equals(file)) {
                System.out.println("FOUND : File " + filename + " exists at " + folder_name);
                return;
            }
        }
        System.out.println("File NOT found (FNF)");
    }

    public static void main(String[] args) {
        System.out.println(WELCOMEPart);
        Project menu = new Project();
        menu.st1();
    }

}
