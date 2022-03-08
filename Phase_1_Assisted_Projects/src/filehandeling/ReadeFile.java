package filehandeling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadeFile{
	public static void main(String[] args) {
		try {
			File obj = new File("F:\\Projects\\Phase_1_Assisted_Projects\\src\\filehandeling");
			Scanner sc = new Scanner(obj);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error Occured");
			e.printStackTrace();
		}

	}

}
