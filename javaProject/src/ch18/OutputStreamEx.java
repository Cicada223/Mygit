package ch18;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps; //PrintStream객체를 부모타입인 OutputStream으로 받아 처리
		//OutputStream도 1byte 처리 스트림이다. 한글X
		try {
			os.write(97); //a
			os.write(98); //b
			os.write(99); //c
			os.flush(); // 출력할땐 flush()
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
