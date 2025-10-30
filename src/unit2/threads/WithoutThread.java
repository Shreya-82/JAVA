package unit2.threads;

public class WithoutThread {
	void task(String task_name) {
		System.out.println(task_name + " is started....");
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(task_name + " is started....");
	}
	
	public static void main(String[] args) {
		WithoutThread wt = new WithoutThread();
		long start_time = System.currentTimeMillis();
		wt.task("Data Collecting");
		wt.task("Data Processing");
		wt.task("Computing");
		long end_time = System.currentTimeMillis();
		System.out.println("The difference is " + (end_time - start_time));
	}

}
