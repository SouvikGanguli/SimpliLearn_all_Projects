package inner_class;

public class MethodLocalInnerClass {
	
	private String hash = "Welcome to the Core java";
	
	public void local() {
		class LocalClass{
			public void display() {
				System.out.println(hash+",this is a Local Inner Class");
			}
		}
		LocalClass i = new LocalClass();
		i.display();
	}

	public static void main(String[] args) {
		MethodLocalInnerClass obj = new MethodLocalInnerClass();
		obj.local();

	}

}
