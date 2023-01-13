package ch06;

public class OverloadEx1 {
	public static void main(String[] args) {
		print(10.5);
		print("Hello");
		print(100);
		print("Hi","Java");
	}

	static void print(double a) {
		System.out.println(a);
	}
	
	static void print(String b) {
		System.out.println(b);
	}
	
	static void print(int c) {
		System.out.println(c);
	}
	
	static void print(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}


}
