package ch03;
import java.util.Scanner;
public class JumSoo {

	public static void main(String[] args) {
		
		String name;
		int Java, DB, HTML, JSP, tot ;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 : ");
		name = scan.next();
		System.out.println("Java : ");
		Java = scan.nextInt();
		System.out.println("DB : ");
		DB = scan.nextInt();
		System.out.println("HTML : ");
		HTML = scan.nextInt();
		System.out.println("JSP : ");
		JSP = scan.nextInt();
		
		tot = Java+DB+HTML+JSP;
		avg = tot/4.0;
		
		System.out.println("======================================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("------------------------------------------------------");
		System.out.println(name+"\t"+Java+"\t"+DB+"\t"+HTML+"\t"+JSP+"\t"+tot+"\t"+avg);
		System.out.println("======================================================");
	}

}
