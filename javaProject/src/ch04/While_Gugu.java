package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int  i, j=1;
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		i = sc.nextInt();
		
		while (j < 10) {
			System.out.println(i +"x"+ j +"=" + (i*j));
			j++;
		}
	}
}
