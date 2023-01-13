package ch10;

class T {
	private int num=10;
	public final void print() {
		System.out.println(num);
	}
}

public class FianlMethod2 extends T {
	int num =100;

	public static void main(String[] args) {
		FianlMethod2 f = new FianlMethod2();
		f.print();
		
	}
}
