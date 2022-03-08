package catch_try;

public class Catch_And_Try {

	public static void main(String[] args) {
		int array[] = new int[7];
		try {
			 array[5]=10;
			 array[6] = 20;
			          
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Box");
			
		}
		finally {
			System.out.println("The size of the array "+ array.length);
		}

	}

}
