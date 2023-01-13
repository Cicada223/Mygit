package ch12;

public class StaticOuter2 {
	static int data = 30;
	int data2 =50;
	static class StaticInner2 {
		void msg() {
			System.out.println("data is "+data);
//			System.out.println("data is "+data2); //non-static 멤버 사용 불가능
		}
	}
	public static void main(String[] args) {
		StaticOuter2.StaticInner2 in = new StaticOuter2.StaticInner2();
		in.msg();
	}
}
