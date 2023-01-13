package ch12;

public class LocalOuter {
	private int data = 30;
	void display() {
		class LocalInner {
			void msg() {
				System.out.println(data);
			}
		}
		LocalInner li = new LocalInner();
		li.msg();
	}
	
	public static void main(String[] args) {
		LocalOuter lo =new LocalOuter();
		lo.display();
		
	}
}

