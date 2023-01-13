package ch16;
//Single Thread : 작업단위가 1개(main 스레드만 존재)
public class SingleThread {
	void print() {
		System.out.println(Thread.currentThread().getName());
		for (int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		SingleThread t= new SingleThread();
		t.print();
		t.print(); 
	}
}
