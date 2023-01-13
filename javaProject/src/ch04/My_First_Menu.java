package ch04;

import java.util.Scanner;

public class My_First_Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cho=100;
		
		while (true) {
			System.out.println("== [메 뉴] ==");
			System.out.println("(1) 한식");
			System.out.println("(2) 양식");
			System.out.println("(3) 중식");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0) ");
			String tem = sc.next();
			cho = Integer.parseInt(tem);
			if (cho == 0) break;
			
			if ( cho ==1 ) {
				System.out.println("[한식메뉴]");
				System.out.println("1. 김치찌개");
				System.out.println("2. 된장찌개");
				System.out.println("3. 삼겹살");
				System.out.println("4. 비빔밥");
				System.out.println("한식메류를 선택하세요.(한식메뉴선택종료 : 0 , 전체종료 : 99 )");
				tem = sc.next();
				cho = Integer.parseInt(tem);
				
				if (cho==0) continue;
				if (cho==99) break;
				if (cho==1) {
					System.out.println("고객님은 김치찌개를 선택하셨습니다."); break;
				}
				if (cho==2) {
					System.out.println("고객님은 된장찌개를 선택하셨습니다."); break;
				}
				if (cho==3) {
					System.out.println("고객님은 삼겹살을 선택하셨습니다."); break;
				}
				if (cho==4) {
					System.out.println("고객님은 비빔밥을 선택하셨습니다."); break;
				}
			}
			if ( cho ==2 ) {
				System.out.println("[양식메뉴]");
				System.out.println("1. 스테이크");
				System.out.println("2. 파스타");
				System.out.println("3. 오믈렛");
				System.out.println("4. 스프");
				System.out.println("한식메류를 선택하세요.(양식메뉴선택종료 : 0 , 전체종료 : 99 )");
				tem = sc.next();
				cho = Integer.parseInt(tem);
				
				if (cho==0) continue;
				if (cho==99) break;
				if (cho==1) {
					System.out.println("고객님은 스테이크를 선택하셨습니다."); break;
				}
				if (cho==2) {
					System.out.println("고객님은 파스타를 선택하셨습니다."); break;
				}
				if (cho==3) {
					System.out.println("고객님은 오믈렛을 선택하셨습니다."); break;
				}
				if (cho==4) {
					System.out.println("고객님은 스프를 선택하셨습니다."); break;
				}
			}
			if ( cho ==3 ) {
				System.out.println("[중식메뉴]");
				System.out.println("1. 짜장면");
				System.out.println("2. 짬뽕");
				System.out.println("3. 볶음밥");
				System.out.println("4. 탕수육");
				System.out.println("한식메류를 선택하세요.(중식메뉴선택종료 : 0 , 전체종료 : 99 )");
				tem = sc.next();
				cho = Integer.parseInt(tem);
				
				if (cho==0) continue;
				if (cho==99) break;
				if (cho==1) {
					System.out.println("고객님은 짜장면을 선택하셨습니다."); break;
				}
				if (cho==2) {
					System.out.println("고객님은 짬뽕을 선택하셨습니다."); break;
				}
				if (cho==3) {
					System.out.println("고객님은 볶음밥을 선택하셨습니다."); break;
				}
				if (cho==4) {
					System.out.println("고객님은 탕수육을 선택하셨습니다."); break;
				}
			}


		}
		System.out.println("프로그램을 모두 종료합니다.");
	}

}
