package ch12;

public class MemberOuter {
	private String name;
	private String email;
	private int num;
	
	public void exec() {
		class Info{
			int num = 1;
			String name = "홍길동";
			String email = "hong@gmail.com";
		}
		Info i = new Info();
		System.out.println("고객번호 : "+i.num);
		System.out.println("이   름 : "+i.name);
		System.out.println("이메일   :" +i.email);
	}
	
	public static void main(String[] args) {
		MemberOuter m = new MemberOuter();
		m.exec();
	}
	
}
