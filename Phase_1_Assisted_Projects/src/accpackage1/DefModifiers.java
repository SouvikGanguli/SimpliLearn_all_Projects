package accpackage1;

class DefaultModifiers{
	void display() {
		System.out.println("You are using default Modifiers:");
	}
}
public class DefModifiers {

	public static void main(String[] args) {
		System.out.println("Default Access Specifier:");
		DefaultModifiers obj = new DefaultModifiers();
		obj.display();

	}

}
