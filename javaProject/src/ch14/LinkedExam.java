package ch14;

import java.util.LinkedList;

public class LinkedExam {
	public static void main(String[] args) {
		//큐 규조 : First In First Out
		String[] fruits = {"사과","배","포도","딸기","수박"};
		LinkedList<String> list = new LinkedList<>();
		for(String str : fruits) {
			list.offer(str); //큐구조에 자료 입력 offer
		}
		String str="";
		while((str=(String)list.poll()) != null) {
			//poll()은 자료형이 미정(E)이기 때문에 형 변환(String)이 필요함
			//poll()한 값을 str에 대입하는데, str은 boolean이 아니기떄문에 묶어야함
			System.out.println(str +"삭제되었습니다.");
		}
	}
}
