package filehandeling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter obj = new FileWriter("F:\\Projects\\Phase_1_Assisted_Projects\\src\\filehandeling");
			obj.write("Students are present");
			obj.close();
			System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
		}

	}

}
