package mainmenu;

import java.util.*;
import ascending.Ascen;
import operation.BusinessOperations;

public class Menu {
	static Scanner sc = new Scanner(System.in);

	public static void info() {
		System.out.println("LockedMe.com");
		System.out.println("Description: Application/Prototype to add, delete, and search files");
	}
	public static void str() {
		System.out.println("");
		System.out.println("Main Menu");
		System.out.println("Press 1 to show file in Ascending Order");
		System.out.println("Press 2 to view file operations");
		System.out.println("Press 3 to Exit from the application");

		int choice = sc.nextInt();
		handle(choice);
	}
	public static void handle(int num) {
		switch(num) {
			case 1:
				Ascen.ascendingOrder();
				break;
			case 2:
				BusinessOperations.FileOperations();
				break;
			case 3:
				System.out.println("Exit");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input");
		}
		str();
	}
	public static void main(String[] args) {
		info();
		str();
	
	}

}
