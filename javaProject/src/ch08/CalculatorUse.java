package ch08;

public class CalculatorUse {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		c1.setLeft(10);
		c1.setRight(20);
		
		System.out.println(c1.getLeft());
		System.out.println(c1.getRight());
		c1.sum();
		c1.avg();
		
		Calculator c2=new Calculator(10,20);
		c2.sum();
		c2.avg();
		
		Calculator c3=new Calculator(20,40);
		c3.sum();
		c3.avg();
		
	}
}
