package ch16;

public class ExternalThread {
	public static void main(String[] args) {
		MyThread t1= new MyThread("스레드1");
		MyThread t2= new MyThread("스레드2");
		MyThread t3= new MyThread("스레드3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("메인스레드"); //다른 스레드가 run하는 시점에 
	}
}
