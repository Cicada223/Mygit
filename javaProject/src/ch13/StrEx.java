package ch13;

public class StrEx {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);	
		//대문자로 변경
		System.out.println(str.toUpperCase());
		//소문자로 변경
		System.out.println(str.toLowerCase());
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
		str = ""; //빈(null)문자열('\0')을 가르킴
		System.out.println("내용 : "+str);
		str = null;//참고하는 내용이 없음 ( 주소값을 삭제 )
		System.out.println("내용 : "+str);
		
		char ch = '\0';
		System.out.println("내용 : "+ch+"code : "+(int)ch);
		ch = ' ';
		System.out.println("내용 : "+ch+"code : "+(int)ch);

	}
}
