package ch12;
abstract class Action {
	public abstract void exec();
}

public class ActionExam extends Action {
	@Override
	public void exec() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Action a = new ActionExam() { // 익명 내부 클래스
			String name = "kim";
			public void exec() {
				System.out.println("나는 "+name+"이다.");
			}
		};
		a.exec();
	}
}
