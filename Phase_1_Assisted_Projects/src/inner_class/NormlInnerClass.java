package inner_class;

public class NormlInnerClass {

	private String lines = "Welcome to the core java ";
	class InnerClass{
		void display() {
			System.out.println(lines+"Lets start Inner Class");
		}
	}
	
	public static void main(String[] args) {
		NormlInnerClass.InnerClass obj = new NormlInnerClass().new InnerClass();
		obj.display();

	}

}
