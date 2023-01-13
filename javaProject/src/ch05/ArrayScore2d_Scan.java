package ch05;

import java.util.Scanner;

public class ArrayScore2d_Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p ;
		System.out.print("학생수를 입력하세요 : ");
		p = sc.nextInt();
		
		String sen = " ";

		
		int[][] score = new int [p][3];
		
		System.out.println("국, 영,수 점수를 각각 입력하세요 : ");
		for (int i=0; i<p; i++) {
			System.out.print((i+1)+"번 학생의 점수 : ");
			for (int j=0; j<3; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i=0; i<p; i++) {
			int sum=0;
			float avg=0.0f;
			System.out.printf("\n%d\t",i+1);
			for (int j=0; j<3; j++) {
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			avg = sum/(float)p;
			String grade ;
			switch ((int)avg/10) {
			case 10 :
			case 9 :	grade = "A"; break;
			case 8 :	grade = "B"; break;	
			case 7 :	grade = "C"; break;
			case 6 :	grade = "D"; break;
			case 5 :	grade = "E"; break;

			default: grade = "F";
				break;
			}
			System.out.printf("%d\t%.1f\t%s",sum,avg,grade);
		}
	}
}
