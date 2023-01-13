package ch16;

public class MyThread_Im implements Runnable {
	public synchronized void thred() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		for(int i=1; i<6; i++) {
			System.out.println(Thread.currentThread().getName() +"==>"+i);
		}
	}
	
}
