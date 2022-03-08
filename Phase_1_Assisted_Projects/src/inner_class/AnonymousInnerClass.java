package inner_class;

public abstract class AnonymousInnerClass {
	public abstract void display(); 
	

	public static void main(String[] args) {
		AnonymousInnerClass obj = new AnonymousInnerClass() {

			@Override
			public void display() {
				System.out.println("Anonymous Inner Class ");
				
			}
			
		};
		obj.display();
	
	}

}
