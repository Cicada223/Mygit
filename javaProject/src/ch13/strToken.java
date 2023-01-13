package ch13;

import java.util.StringTokenizer;

public class strToken {
	public static void main(String[] args) {
		String str = "kim,20,180,55,서울,학생";
		
		String[] items=str.split(","); //콤마(,)기준으로 데이터 분리
		for(String s : items) {
			System.out.println(s);
		}
		
		//StringTokenizer는 String 객체의 split()등의 메소드보다 더 다양함
		StringTokenizer st = new StringTokenizer(str,",");
		int cnt=st.countTokens();
		System.out.println("토큰의 갯수 : "+cnt);
		while (st.hasMoreTokens()) {//객체안 토큰이 하나라도 존재하면 true, 없으면 false
			System.out.println(st.nextToken());//객체안 토큰하나를 가져와 반환
		}
	}
}
