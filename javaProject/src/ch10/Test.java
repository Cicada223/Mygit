package ch10;

public class Test {
	static int a;
	int b;
	void print() {
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t = new Test();
		System.out.println(t.b);
		
		System.out.println(Math.PI);
		
		
	}
}
