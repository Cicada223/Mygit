package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;//1byte
		InputStreamReader isr = new InputStreamReader(is); //2byte
		System.out.println("한글자를 입력하세요 : ");
		try {
			int code = isr.read();
			System.out.println("code : "+code);
			char ch = (char)code;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
