package threads.projects;

public class ExtThreads extends Thread {
	public void run()
	{
		System.out.println("ExtThreads is Running");
	}

	public static void main(String[] args) {
		ExtThreads t1 = new ExtThreads();
		t1.start();

	}

}
