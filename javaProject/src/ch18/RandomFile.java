package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		String str= null;
		try {//r읽기전용 w쓰기전용 rw읽기쓰기
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand.txt", "rw");
			System.out.println(file.getFilePointer());
			//getfilepointer()  파일포인터( 어디까지 읽었는지 알려줌)
			file.seek(8);
			System.out.println(file.getFilePointer()); //8
			file.write("HTML".getBytes());//HTML로 기존내용을 덮음
			System.out.println(file.length());//문자 길이 
			System.out.println(file.getFilePointer());
			while (file.getFilePointer()<file.length()) {
				//파일의 내용보다 파일포인터의 위치값이 적으면 반복
				str=file.readLine();
				//한글처리
				//String(문자열,캐릭터셋) 인코딩 방식 변환
				//iso-8859-1 , 8859_1 :서유럽 언어 인코딩 방식
				//ms949(eucKr) :2바이트 (완성형)
				str  = new String(str.getBytes("8859_1"),"utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
