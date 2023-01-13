package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p =2;
		String[] name = new String[p];
		int[] kor = new int[p];
		int[] eng = new int[p];
		int[] mat = new int[p];
		int[] tot = new int[p];
		double[] avg = new double[p];
		double tot_avg = 0;
		String sen=" ";
		
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		
		for (int i=0; i<name.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			System.out.print("국어점수 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어점수 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수 : ");
			mat[i] = sc.nextInt();
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3.0 ;
			tot_avg += avg[i];
			
			sen +="\n"+ "이름 : "+name[i]+"\n"+"국어 : "+kor[i]+"\n"+"영어 : "+eng[i]+"\n"
					+"수학 : "+mat[i]+"\n"+"총점 : "+tot[i]+"\n"+"평균 : "+String.format("%.1f",avg[i]);   
		}
		System.out.println(sen);
		System.out.println("==========================");
		System.out.println("학급평균 : "+ String.format("%.1f", tot_avg/p));
		
	}

}
