package ch05;

public class CharArray {

	public static void main(String[] args) {
		char[] ch= {'J','a','v','a'} ; // 실무형
		// 정석으로 바꿔서 처리
		char[] ch2;
		ch2 = new char[4];
		ch2[0] = 'J';
		ch2[1] = 'a';
		ch2[2] = 'v';
		ch2[3] = 'a';
		
		
		for (int i=0; i<ch.length; i++) {
			System.out.println(i+"번째 문자 : " + ch[i]);
		}
		System.out.println("0번째 문자 : "+ch2[0]);
		System.out.println("1번째 문자 : "+ch2[1]);
		System.out.println("2번째 문자 : "+ch2[2]);
		System.out.println("3번째 문자 : "+ch2[3]);
	}

}
