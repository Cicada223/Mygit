package ch13;
//인스턴스를 복제하려면  Cloneable을 implements해야한다
public class Clone implements Cloneable {
	int num=10;
	void print() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Clone t1=new Clone();
		Clone t2=null;
		try {//예외가 발생할 가능성의 코드
			t2 = (Clone)t1.clone();
		} catch (Exception e) { //예외가 발생될때 작동
			e.printStackTrace();//개발자를 위한 디버깅 정보 제공
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}

}
