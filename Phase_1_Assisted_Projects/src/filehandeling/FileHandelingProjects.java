package filehandeling;
import java.io.File;
import java.io.IOException;
public class FileHandelingProjects {

	public static void main(String[] args) {
		try {
		
		File obj = new File("F:\\Projects\\Phase_1_Assisted_Projects\\src\\filehandeling");
		if(obj.createNewFile()) {
			System.out.println("New file created"+obj.getName());
		}else {
			System.out.println("File already exist");
		}
		
		}
		catch(IOException e) {
			System.out.println("An error has Occured");
			e.printStackTrace();
			
		}
	}

}
