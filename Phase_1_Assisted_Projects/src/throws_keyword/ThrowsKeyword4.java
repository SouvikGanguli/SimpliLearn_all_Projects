package throws_keyword;

 public class ThrowsKeyword4 extends Exception{ 
		public ThrowsKeyword4(String s)
	    { 
	        super(s); 
	    } 
		
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new ThrowsKeyword4("Student"); 
	        } 
	        catch (ThrowsKeyword4 ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	}

