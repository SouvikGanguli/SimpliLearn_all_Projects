package methods_assisproject;

public class Methods {

	public int multinumber(int a, int b) {
		int c = a*b;
		return c;
	}
	
	public static void main(String[] args) {
		Methods obj = new Methods();
		int d = obj.multinumber(50, 20);
		System.out.println("Multiplication is : "+ d);

	}

}
