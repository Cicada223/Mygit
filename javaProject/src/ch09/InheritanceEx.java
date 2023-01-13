package ch09;

public class InheritanceEx {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨강색"); // 객체생성과 동시에 매개변수가 잇는 생성자 호출
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("공 : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
		
		Circle c3 = new Circle(4);
		Ball c4 = new Ball();
		
	}
}
