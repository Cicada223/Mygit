package ch11;

public class Test2 extends Test {

	@Override
	public void print() {
		System.out.println("추상클래스 구현");
	}
	public static void main(String[] args) {
		//Test a = new Test(); //추상클래스인 부모클래스는 생성이 안된다.
		// 추상 클래스는 생성이 안됨
		Test2 t = new Test2();
		t.print();
	}

}
