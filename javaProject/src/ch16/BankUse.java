package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank mb = new MyBank();
		
		BankPlayer A = new BankPlayer(1, mb);
		BankPlayer B = new BankPlayer(2, mb);
		BankPlayer C = new BankPlayer(3, mb);
		
		A.setPriority(Thread.MAX_PRIORITY);
		C.setPriority(Thread.MIN_PRIORITY);
		
		A.start();
		B.start();
		C.start();
	}
}
