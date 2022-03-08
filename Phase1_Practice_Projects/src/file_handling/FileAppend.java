package file_handling;
import java.io.IOException;
import java.io.FileWriter;
public class FileAppend {

	public static void main(String[] args) {
		String data = "This data is appended...";
		
		try {
			FileWriter output = new FileWriter("data1.text", true);
			output.write(data);
			System.out.println("Data appended successfully");
			output.close();
			
		}catch(IOException ex) {
			System.out.println("File Append error...");
		}

	}

}
