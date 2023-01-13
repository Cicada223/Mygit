package ch16;

public class ATMsync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm,"mom");
		Thread son = new Thread(atm,"son");
		mom.start();
		son.start();
	}
}

class ATM implements Runnable {
	private long accBalance = 10000; //통장잔고
	
	
	
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<10; i++) {
				notify(); // 일시정지 상태에 있는 스레드를 깨움
				// wait 하고 있는 스레드(한개만) notify를 보낸다. 여러개의 wait도 하나만 깨움(알수없음)
				// wait하고 있는 스레드가 없는 경우 자동소멸함
				
				//notifyAll() 모든 wait을 다 깨움. 순서는 알수 없음
				try {
					wait();
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(getAccount() <= 0) { //통장잔액이 없으면 
					break;
				}
				withDraw(1000);
			}
			
		}
	}




	public void withDraw(long cash) { //출금거래메소드
		if(getAccount() > 0) {
			accBalance -= cash;
			System.out.print(Thread.currentThread().getName()+" , ");
			System.out.printf("잔액 : %,d원%n",getAccount());
		}else {
			System.out.print(Thread.currentThread().getName()+" , ");
			System.out.println("잔액이 부족합니다.");
		}
	}
	public long getAccount() {
		return accBalance;
	}
	
}
