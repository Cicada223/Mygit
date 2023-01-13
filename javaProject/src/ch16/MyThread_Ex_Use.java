package ch16;

public class MyThread_Ex_Use {
	public static void main(String[] args) {
		MyThread_Ex mt1 = new MyThread_Ex();
		MyThread_Ex mt2 = new MyThread_Ex();
		
		mt1.setName("스레드1");
		mt2.setName("스레드2");
		
		mt1.setPriority(Thread.MIN_PRIORITY);
		mt2.setPriority(Thread.MAX_PRIORITY);
		
		mt1.start();
		mt2.start();
	}
}
