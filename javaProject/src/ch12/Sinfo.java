package ch12;

public class Sinfo extends Student{
	private String name, addr, email;
	private int kor, eng, mat;
	private int tot;
	private double avg;
	
	
	
	@Override
	void address(String name, String addr, String email) {
		this.name = name;
		this.addr = addr;
		this.email = email;
	}
	
	@Override
	void point(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
	}
	
	public void print() {
		System.out.println("=============================================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name+"\t"+addr+"\t"+email);
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot
				+"\t"+String.format("%.1f", avg));
		System.out.println("=============================================");
	}
}
