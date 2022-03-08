package throws_keyword;

public class ThrowsKeyword1 {

	public static void main(String[] args) 
	        {
		          int a=100,b=3,str;

	            try
	            {
	                if(b==0)        
	                    throw(new ArithmeticException("Can't divide by zero."));
	                else
	                {
	                    str = a / b;
	                    System.out.print("The result is : " + str);
	                }
	            }
	            catch(ArithmeticException Ex)
	            {
	                System.out.print("Error : " + Ex.getMessage());
	            }

	            System.out.print("End of program.");
	        }
	    


	}


