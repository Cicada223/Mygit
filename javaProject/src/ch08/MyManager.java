package ch08;

public class MyManager {
	private int score ;
	
	private MyManager(int score) {
		this.score = score;
	}
	
	//
	private static MyManager mgr;// 객체형 데이터 타입 참조변수
	
	public static MyManager getInstance() {
		if(mgr==null) { // 처음 MyManager가 객체화 될 때의 경우
			mgr=new MyManager(10);
		}
		return mgr; // 한번 이상 객체 생성되었다면 ( 주소값이 있으면 )
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
