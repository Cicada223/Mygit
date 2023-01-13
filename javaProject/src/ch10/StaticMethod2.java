package ch10;

public class StaticMethod2 {
	static int num = 10;  			//사번
	static String name = "홍길동"; 
	String email = "hong@gmail.com";
	String hp = "010-1234-5678";
	String addr = "서울 강남구 역삼동";
	
	public void print() {
		System.out.println("사번  : "+ num);
		System.out.println("이름  : "+ name);
		System.out.println("이메일 : "+ email);
		System.out.println("전화  : "+hp);
		System.out.println("주소  : "+addr);
	}
	
	public static void printA() {
		System.out.println("==== print A ====");
		StaticMethod2 s = new StaticMethod2();
		s.print();
	}
	public void printB() {
		System.out.println("==== print B ====");
		print();
	}
	
	public static void main(String[] args) {
		printA();
		System.out.println();
		StaticMethod2 p = new StaticMethod2();
		p.printB();
	}
}
