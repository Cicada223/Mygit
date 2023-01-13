package ch13;

public class MemberAnony  {
	public static void main(String[] args) {
		Member m = new Member() {
			
			@Override
			public void num() {
				System.out.println("고객번호 : 2");
			}
			
			@Override
			public void name() {
				System.out.println("이   름 : 김길동");
			}
			
			@Override
			public void email() {
				System.out.println("이 메 일: kim@gmail.com");
			}
		};
		m.num();
		m.name();
		m.email();
	}
}
