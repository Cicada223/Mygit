package ch09;

public class Shape {
	private String name;
	public Shape () {
		super();
	}
	public Shape(String name) {
		super();
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public double calculateArea() {
		return 0;
	}
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
	
}
