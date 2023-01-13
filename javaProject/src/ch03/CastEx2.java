package ch03;

public class CastEx2 {

	public static void main(String[] args) {
		int a = 500;
		float b = 200.2f;
		int c = 128;
		
		double d= a;
		System.out.println("int a => double : " + d);
		
		int e = (int) b;
		System.out.println("float b => int : " + e);
		
		byte f = (byte)c;
		System.out.println("int a => byte : " + f);
		
		
	}

}
