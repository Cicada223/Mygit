package ch09;

public class CircleShape extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public CircleShape(int radius) {
		super("Circle");//매개변수가 있는 부모생성자 호출
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원");
		super.draw();
	}
	

}
