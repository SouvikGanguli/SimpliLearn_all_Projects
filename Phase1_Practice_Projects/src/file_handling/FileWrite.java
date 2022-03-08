package file_handling;
import java.io.FileWriter;
import java.io.IOException;
public class FileWrite {

	public static void main(String[] args) {
		String data = "kolkata, Delhi, Mumbai, Hydrabad ";
		try {
			FileWriter output = new FileWriter("data1.text");
			output.write(data);
			System.out.println("Data is written successfully");
			output.close();
		}catch(IOException ex) {
			System.out.println("File write Error...");
		}

	}
		
	}


