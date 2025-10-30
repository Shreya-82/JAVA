package unit2.threads;

public class WithThread extends Thread{
	String task_name;
	public WithThread(String task_name) {
		this.task_name = task_name;
	}
	
	public void run() {
		System.out.println(task_name + " is started....");
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(task_name + " is started....");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WithThread t1 = new WithThread("Data Collection");
		WithThread t2 = new WithThread("Data Processing");
		WithThread t3 = new WithThread("Computing");
		long start_time = System.currentTimeMillis();
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		long end_time = System.currentTimeMillis();
		System.out.println("The difference is " + (end_time - start_time));
	}

}
