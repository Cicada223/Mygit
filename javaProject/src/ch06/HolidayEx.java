package ch06;

import java.util.Scanner;

public class HolidayEx {
	static int y;//전역변수 , 클래스 전체에서 사용가능
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("근속연수를 입력하세요 : ");
		y = sc.nextInt();
		sc.close();
	}
	
	static int holiday(int year) {
		int day=0;
		if(year <= 5) {
			day=10;
		}else if (year <=5) {
			day=15;
		}else {
			day=20;
		}
		return day;
	}
	public static void main(String[] args) {
		input();
		System.out.println("휴가일수 : " + holiday(y));
	}
}
