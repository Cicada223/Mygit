package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleExam {
	public static void main(String[] args) {
		int num = 50;
		Scanner sc = null;
		try {
			System.out.println("숫자를 입력하세요 : ");
			sc = new Scanner(System.in);
			int value = sc.nextInt();
			System.out.println(num / value);
		} catch (NullPointerException e) {
			System.out.println("널포인터 예외");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력할 수 있습니다.");
		} catch (Exception e) {
			System.out.println("기타 예외");
		} finally {//예외 상관없이 작동
			if(sc != null) {
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
}
