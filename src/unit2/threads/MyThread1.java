package unit2.threads;

public class MyThread1 implements Runnable{
	public void run() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		Thread th1 = new Thread(t1);
		th1.start();
	}

}
