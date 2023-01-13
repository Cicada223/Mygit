package ch03;
import java.util.Scanner;
public class Point {

	public static void main(String[] args) {
		
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		mat = scan.nextInt();
		scan.close();
		
		//  계산
		tot = kor+eng+mat ;
		avg = tot/3.0;
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f",name,kor,eng,mat,tot,avg);
	}

}
