package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//ArrayList<클래스객체> - <Object> 대신 만들어놓은 Member객체를 제너릭을 하면 Member에서
		//쓰이는 모든 자료형을 처리할 준비가 가능해짐
		List<Member> list = new ArrayList<>();
		
		Member m1 = new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@naver.com");
		
		list.add(m1); //ArrayList에 Member객체를 1개 추가
		System.out.println(list.size());
		
		Member m2 = new Member("hong", "1234", "홍길동", "010-1234-5555", "hong@nate.com");
		list.add(m2);
		System.out.println(list.size());
		
		list.add(new Member("choi", "1234", "최철수", "031-1111-2222", "choi@gmail.com"));
		System.out.println(list.size());
		
		System.out.println("이름\t아이디\t비번\t전화\t이메일");
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i); //m은 ArrayList의 각 데이터를 가르킬 임시 참조변수로 활용
			System.out.println(m);
			System.out.print(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()
			+"\t"+m.getTel()+"\t"+m.getEmail()+"\n");
		}
				
	}
}
