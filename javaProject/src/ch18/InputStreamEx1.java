package ch18;

import java.io.InputStream;

//~stream 객체들은 1byte단위로 스트림 처리하며, 영무 대소문자, 숫자 , 특문만 처리가능
//inputstream,outputstream
public class InputStreamEx1 {
	public static void main(String[] args) {
		InputStream is = System.in; //대표적으로 system.in은 intputstream이다.
		System.out.println("문자를 입력하세요 : ");
		try {//입출력, 네트워크, DB는 필수적 예외처리
			int code = is.read();//키보드로부터 1byte로 읽음, 따라서 한글(2byte)처리가 안됨.
			//한글은 InputStreamReader를 써야함
			System.out.println(code);
			char ch = (char)code;//모든 문자에는 고유한 숫자코드가 있다.
			System.out.println("char : "+ch);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
