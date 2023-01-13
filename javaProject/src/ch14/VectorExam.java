package ch14;

import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
//		Vector v= new Vector<>();
		Vector<Object> v = new Vector<>();
		System.out.println("초기사이즈 : "+v.capacity()); //capacity() : 사이즈 길이값 리턴
//		벡터는 기본적으로 10개의 사이즈를 만듬
		v.add("first"); //add("추가할 자료")
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(102);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		System.out.println("초기사이즈 : "+v.capacity()); //capacity() : 사이즈 길이값 리턴
		System.out.println("데이터의 갯수 : "+v.size());
		System.out.println("초기데이터");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t"); //배열이지만 [i]처럼 쓰면 안된다.
		}
		System.out.println();
		v.add(6,102);
		v.remove(0);
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
	}
}
