package ch16;
//멀티스레드 : 작업단위가 2개이상
//멀티스레드 구현 방법
//1. Thread 상속
//2. Runnable을 구현
public class ThreadExam extends Thread{
	public ThreadExam(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000); //cpu를 1초간 멈춤
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread1");
		ThreadExam e2 = new ThreadExam("thread2");
		ThreadExam e3 = new ThreadExam("thread3");
		
		e1.start();
	}
}
