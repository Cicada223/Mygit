package ch12;

public class TestOuter {
	private int data = 30;
	class Inner {
		void msg () {
			System.out.println("data is "+data);
		}
	}
	
	public static void main(String[] args) {
		TestOuter obj = new TestOuter();
		TestOuter.Inner in = obj.new Inner(); //내부 객체 생성
		in.msg();
	}
}
