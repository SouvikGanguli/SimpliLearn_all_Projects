package sleep_and_wait;

public class SleepandWait {

	private static Object LOCK = new Object();
	 
	public static void main(String[] args)
	  throws InterruptedException {
	  
	    Thread.sleep(1000);
	   System.out.println("The current Thread");
	     
	   synchronized (LOCK)
	    {
		   LOCK.wait(1000);
	      System.out.println("Lock is woken up after waiting 1 second");
	    }

	}

}
