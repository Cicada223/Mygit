package ch05;

import ch03.CastEx;

public class ArrayScore2D {
	public static void main(String[] args) {
		int [][] score= new int [5][3];
		score[0][0] = 100;
		score[0][1] = 100;
		score[0][2] = 100;
		
		score[1][0] = 89;
		score[1][1] = 76;
		score[1][2] = 92;
		
		score[2][0] = 88;
		score[2][1] = 69;
		score[2][2] = 72;
		
		score[3][0] = 45;
		score[3][1] = 60;
		score[3][2] = 59;
		
		score[4][0] = 96;
		score[4][1] = 92;
		score[4][2] = 89;
		

		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<score.length; i++) {
			int sum=0;
			float avg=0.0f;
			System.out.printf("%d\t",i+1);
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			avg = sum/(float)score[i].length;
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
			
			System.out.printf("%d\t %.1f \t%s\n",sum,avg,grade);
		}
	}
}
