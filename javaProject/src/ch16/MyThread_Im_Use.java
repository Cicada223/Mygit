package ch16;

public class MyThread_Im_Use {
	public static void main(String[] args) {
		MyThread_Im mt = new MyThread_Im();
		
		Thread mt1 = new Thread(mt,"스레드1");
		Thread mt2 = new Thread(mt,"스레드2");
		
		mt1.setPriority(Thread.MAX_PRIORITY);
		mt2.setPriority(Thread.MIN_PRIORITY);
		
		mt1.start();
		mt2.start();
	}
}
