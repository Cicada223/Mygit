package ch06;

public class StudentPoint {

	public static void Info() {
		int[] tot = new int [3];
		int[] SN = new int [3];
		double[] avg = new double [3] ;
		
		String[] name = {"홍길동","사임당","이순신"};
		int[] Java = {90,95,84};
		int[] DB = {85,79,92};
		int[] HTML = {99,88,95};
		int[] JSP = {76,92,72};
		
		for(int i=0; i<3; i++) {
			SN[i] = 1000+(i+1);
		}
		for(int i=0; i<3; i++) {
			tot[i] = Java[i]+DB[i]+HTML[i]+JSP[i] ;
		}
		for(int i=0; i<3; i++) {
			avg[i] = tot[i]/4;
		}
		for(int i=0; i<3; i++) {
		System.out.println(SN[i]+"\t"+name[i]+"\t"+Java[i]+"\t"+DB[i]+"\t"+HTML[i]+"\t"+JSP[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
	}
	
	public static void Title() {
		System.out.println("-------------------------------------------------------------");
		System.out.println("학번\t이름\tJava\tBD\tHTML\tJSP\t총점\t평균");
		System.out.println("=============================================================");
	}
	public static void End() {
		System.out.println("-------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		Title();
		Info();
		End();
	}

}
