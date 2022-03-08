package throws_keyword;

public class ThrowsKeyword2{
        
	void Division() throws ArithmeticException
        {
            int c = 85,d = 0,str;
            str = c/d;
            System.out.println("The result is : " + str);
        }
         public static void main(String[] args)
        {
           ThrowsKeyword2 obj = new ThrowsKeyword2();
             try
            {
                obj.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.println("Error : "+ Ex.getMessage());
            }
             System.out.println(" End of program.");
        }
    }

		
