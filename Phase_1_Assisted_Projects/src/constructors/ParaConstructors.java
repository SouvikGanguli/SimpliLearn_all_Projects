package constructors;

class paracon{
	int id;
	String name;
	
	paracon(int c, String con)
	{
		id = c;
		name = con;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}

public class ParaConstructors {

	public static void main(String[] args) {
		paracon obj = new paracon(233,"shivam");
		obj.display();

	}

}
