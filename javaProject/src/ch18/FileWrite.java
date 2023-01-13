package ch18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		//프로그램 ==> 파일(출력스트림이 필요)
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("C:\\test\\aa.txt");
			System.out.println("입력하세요: ");
			while(true) {
				int ch=System.in.read(); //1byte읽음
				if(ch==13) break;
				os.write(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
