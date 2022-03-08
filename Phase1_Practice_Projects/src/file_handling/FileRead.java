package file_handling;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {

	public static void main(String[] args) {
		char [] data = new char[100];
		
		try {
			FileReader input =new FileReader("data1.text");
			input.read(data);
			System.out.println("Data received from a file");
			System.out.println(data);
			input.close();
		}catch(IOException ex) {
			System.out.println("File read error....");
		}

	}

}
