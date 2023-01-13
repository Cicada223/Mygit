package ch02;

import java.util.Scanner; //Ctrl + Shfit + o

public class ScannerEx {

	public static void main(String[] args) {
		// 키보드로 부터 사용자 입력 값을 처리해주는 Scanner
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 정수값을 입력하세요 : ");
		int x = in.nextInt(); //정수값을 입력받게 하는 메소드 nextInt()
		System.out.println("두번째 정수값을 입력하세요 : ");
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n" , x, y, x*y);
		in.close(); // 스캐너 종료
	}

}
