package phase1.section6.lession1;

public class TypeCasting {

	public static void main(String[] args) {
				System.out.println("Implicit Type Casting");
				int a = 500;
				System.out.println("Value of b: "+ a);
				
				float c = a;
				System.out.println("Value of c: "+ c);
				
				long d = a;
				System.out.println("Value of d: "+ d);
				
				double e = c;
				System.out.println("Value of e: "+ e);
				
				System.out.println();
				
				System.out.println("Explicit Type Casting");
				
				double x = 80000.67;
				float z = (float)x;
				int y = (int)x;
				System.out.println("Value of z:"+ z);
				
				System.out.println("Value of x: "+ x);
				
				System.out.println("Value of y: "+ y);
				
			}
		}



