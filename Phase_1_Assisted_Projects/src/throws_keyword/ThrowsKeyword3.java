package throws_keyword;

public class ThrowsKeyword3 {
	public static void main(String[] args) {
		int i = 45,j = 0,str=0;
	            try
	            {
	                str = i / j;
	            }
	            catch(ArithmeticException Ex)
	            {
	                System.out.println("Error : " + Ex.getMessage());
	            }
	            finally
	            {
	                System.out.println("The result is : " + str);
	            }
	        }
	    }


