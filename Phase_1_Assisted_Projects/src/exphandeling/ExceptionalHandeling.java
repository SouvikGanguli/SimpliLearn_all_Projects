package exphandeling;

public class ExceptionalHandeling {
	class ExceptionThrown{
		
	    static int divideZero(int a, int b){
	        int c = a/b;
	        return c;
	    }
	    static int computeDivision(int a, int b) {
	         
	        int obj = 0;
	         
	        try
	        {
	        obj = divideZero(a,b);
	        }
	        catch(NumberFormatException ex)
	        {
	        System.out.println("NumberFormatException occurred");
	        }
	        return obj;
	    }
	     
	    public static void main(String args[]){
	         int a = 1;
	         int b = 0;
	         
	        try
	        {
	            int c = computeDivision(a,b);
	         
	        }
	         catch(ArithmeticException ex)
	        {
	            System.out.println(ex.getMessage());
	        }
	    }
	}

}
