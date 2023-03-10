package ch14;

public class Type3<T> { //자료형이 미정인 상태<아무문자> => <>제너릭 기호
	T t; //변수도 자료형 미정
	public Type3() { //생성자 처리를 하고자 한다면 <T>를 빼고 처리한다
	}
	public Type3(T a) {//생성자 매개변수를 쓴다면 타입은 위에서 정한 T로 처리해야한다.
		t=a;
	}
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	public static void main(String[] args) {
		Type3<String> t=new Type3<String>();
		t.setT("Hello");
		System.out.println(t.getT());
		Type3<Integer> t2=new Type3<>(); //우변은 생략 가능
		t2.setT(100);
		System.out.println(t2.getT());
		Type3<Double> t3=new Type3<>(200.5);
		System.out.println(t3.getT());
		
		//Object 처리
		Type3 t4 =new Type3();
		t4.setT(100.5);
		System.out.println(t4.getT());
		t4.setT("Java");
		System.out.println(t4.getT());
	}
	
	
}
