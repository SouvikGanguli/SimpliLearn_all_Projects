package accpackage1;

class PriMod{
	private void display() {
		System.out.println("We are using Private Modifier");
	}
	
}

public class PrivateModifiers {

	public static void main(String[] args) {
		System.out.println("Private Access Modifiers");
		PriMod obj = new PriMod();
		//obj.display;
		

	}

}
