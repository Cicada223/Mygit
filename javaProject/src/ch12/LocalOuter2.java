package ch12;

public class LocalOuter2 {
	private int data = 20;
	void display() {
		class LovalInner2 {
			int value = 50;
			void msg() {
				System.out.println(value);
				System.out.println(data);
			}
		}
		LovalInner2 li = new LovalInner2();
		li.msg();
	}
	
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
		lo.display();
	}
}
