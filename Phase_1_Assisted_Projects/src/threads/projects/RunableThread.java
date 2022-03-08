package threads.projects;

public class RunableThread implements Runnable {
	public void run() {
		System.out.println("RunableThread is Running");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(new RunableThread());
		t2.start();

	}

}
