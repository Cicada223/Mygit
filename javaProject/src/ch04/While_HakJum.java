package ch04;

import java.util.Scanner;

public class While_HakJum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot ;
		int i=0;
		double avg;
		String gra;
		String sen = "";
		
		System.out.println("전체 성적입력이 끝나면 마지막에 -1을 입력하세요.");
		System.out.print("아무정수나 입력하세요 : ");
		i = sc.nextInt();
		while (i != -1) {
			System.out.print("국어 성적을 입력하십시오 : ");
			kor = sc.nextInt();
			System.out.print("영어 성적을 입력하십시오 : ");
			eng = sc.nextInt();
			System.out.print("수학 성적을 입력하십시오 : ");
			mat = sc.nextInt();
			System.out.print("아무정수나 입력하세요 : ");
			i = sc.nextInt();
			
			tot = kor+eng+mat;
			avg = tot/3.0 ;
			
			if (avg > 90) {
				gra = "수";
			}else if (avg > 80) {
				gra = "음";
			}else if (avg > 70) {
				gra = "미";
			}else if (avg > 60) {
				gra = "양";
			}else if (avg > 50) {
				gra = "가";
			}else gra = "미달" ;
			
			sen += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f",avg)+"\t"+gra+"\n";
			
		}
		System.out.println("==============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("----------------------------------------------");
		System.out.println(sen);
		System.out.println("==============================================");		
	}

}
