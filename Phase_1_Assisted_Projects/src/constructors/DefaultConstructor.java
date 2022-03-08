package constructors;

class defcon{
	int id;
	String name;
	
	void dislay() {
		System.out.println(id+" "+name);
	}
}


public class DefaultConstructor {

	public static void main(String[] args) {
		defcon obj = new defcon();
		obj.dislay();

	}

}
