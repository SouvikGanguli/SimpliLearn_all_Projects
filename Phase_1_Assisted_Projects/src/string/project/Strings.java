package string.project;

public class Strings {

	public static void main(String[] args) {
		System.out.println("Methods of Strings:");
		System.out.println();
		String str = new String("My name is Souvik");
		String oj = new String("Hello world");
		System.out.println("The length of the String: "+ str.length());
		System.out.println("The sub String: "+str.substring(7));
		System.out.println("Comparison: "+ str.compareTo(oj));
		System.out.println("Is the String Empty? "+ str.isEmpty());
		System.out.println("To Lower Case: "+ str.toLowerCase());
		System.out.println("Replace: "+ str.replace('S', 'P'));
		System.out.println("Equal? "+ str.equals(oj));
		
		System.out.println();
		
		System.out.println("Creating StringBuffer");
		StringBuffer s = new StringBuffer("Welcome to WestBengal, ");
		System.out.println("Append: "+ s.append("Enjoy the trip"));
		System.out.println("Insert Method: "+ s.insert(3, 'y'));
		
		System.out.println();
		
		System.out.println("Creating String Builder:");
		StringBuilder cop = new StringBuilder("journey");
		System.out.println("Append"+ cop.append("journey"));
		System.out.println("Delete"+ cop.delete(0,1));
		
	}
}			
				