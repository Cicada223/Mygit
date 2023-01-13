package ch13;

public class AutoBox {
	public static void main(String[] args) {
		int num1=10;
		int num2;
		
		Integer i1;
		Integer i2 = new Integer(20);
		i1 = num1;
		num2 = i2;
		
		System.out.println(i1);
		System.out.println(num2);
	}
}
