package ch16;

public class DaemonTread implements Runnable{

	@Override
	public void run() { 
		while(true) {//while(true)지만 main스레드가 종료되면 자동종료됨
			System.out.println("데몬 스레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break; //Exeption발생시 while문 빠져나가도록
			}//while
		}
	}
	
	public static void main(String[] args) {
		Thread th = new Thread(new DaemonTread());
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인스레드가 종료됩니다.");
	}
  
}
