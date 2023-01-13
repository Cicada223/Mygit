package ch09;

public class Test {
	public static void main(String[] args) {
		for ( int i=1; i<=20; i++ )  {
			switch ( i % 5  ) {

			case 0 : System.out.println(i + "은(는) 5의 배수 입니다.");

			break;

			default : System.out.println (i + "은(는) 5의 배수가 아닙니다.");

			break;

			}

			}
	}
}
