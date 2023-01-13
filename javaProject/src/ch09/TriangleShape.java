package ch09;

public class TriangleShape extends Shape {
	private int width;
	private int heigth;
	//get set
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	//생성자
	public TriangleShape(int width, int heigth) {
		super("Triangle");
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override
	public double calculateArea() {
		return width*(heigth*0.5);
	}
	@Override
	public void draw() {
		System.out.println("높이가 "+heigth +", 밑변이 "+width +"인 삼각형");
		super.draw();
	}
	

}
