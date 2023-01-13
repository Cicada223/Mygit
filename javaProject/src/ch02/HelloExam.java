package ch02;


/**
 * @author cicad
 * @version 1.0
 *
 */
public class HelloExam {

	public static int sum(int n, int m) { // 메소드
		return n + m ;
	}
	// 프로그램의 시작은 메인 메소드 부터
	public static void main(String[] args) { // 메인 메소드
		int i = 20; // 변수 초기화 ( 할당 )
		int s; // 선언만 
		char a; 
		
		s = sum(i,10);
		a = '?'; // 변수 초기화
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
