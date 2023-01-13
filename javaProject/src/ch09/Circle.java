package ch09;

public class Circle {
	private void secret() {
		System.out.println("비밀이다.");
	}
	protected void findRadius() {
		System.out.println("반지름 구하기");
	}
	public void findArea() {
		System.out.println("넓이 구하기");
	}
	public Circle() {
		
	}
	public Circle(int r) {
		System.out.println("반지름 : "+r);
	}
}
