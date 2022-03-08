package class_and_object;

public class Polymor {
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	        Polymor s = new Polymor(); 
	        System.out.println(s.sum(30, 50)); 
	        System.out.println(s.sum(30, 50, 70)); 
	        System.out.println(s.sum(20.5, 30.5)); 
	    } 


}
