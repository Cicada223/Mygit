package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p ;
		
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		p = sc.nextInt();		
		
		int[] score = new int [p];
		int tot = 0;
		double avg = 0;

		for (int i=0; i<p; i++) {
			System.out.print("성적을 입력하세요 : ");
			score[i] = sc.nextInt();
			tot += score[i] ;
			avg = tot/p ;
		}
		System.out.print("총점은 "+tot+"점 입니다.");
		System.out.print("평균 성적은 "+String.format("%.1f", avg)+"점 입니다.");
	}

}
