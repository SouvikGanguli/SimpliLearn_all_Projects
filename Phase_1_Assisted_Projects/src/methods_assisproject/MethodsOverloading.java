package methods_assisproject;

public class MethodsOverloading {

	public void area(int a, int b) {
		System.out.println("Area of Triangle = "+ (0.5*a*b));
	}
	public void area(int r) {
		System.out.println("Area of circle = "+ (3.14*r*r));
	}
	public static void main(String[] args) {
		MethodsOverloading obj = new MethodsOverloading();
		
		obj.area(12, 9);
		obj.area(10);

	}

}
