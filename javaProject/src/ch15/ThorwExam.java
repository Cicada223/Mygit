package ch15;

public class ThorwExam {
	//throw : 예외를 직접 발생시킴
	static void test(int n) {
		if(n ==0 ) {
			throw new NullPointerException();
			//throw new 예외클래스(); =? 특정한 조건에 인위적 예외를 발생시킴
		}
	}
	public static void main(String[] args) {
		test(0);
	}
}
