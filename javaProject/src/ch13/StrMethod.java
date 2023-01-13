package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 +=" programming";
		
		System.out.println(str1.length());
		String str2 = str1.concat(" programmig"); //concat()도 문자열 연결시킴
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2)); //n번째 문자 리턴
		System.out.println(str2.indexOf("program")); // "program"의 시작위치 찾아줌
		System.out.println(str2.indexOf("z"));
		System.out.println(str2.substring(0, 4));//0~ 4까지 추출
		System.out.println(str2.substring(5)); // 5~ 끝까지
		System.out.println(str2.replace("java","jsp")); // 치환
		System.out.println(str2);
		str2 = str2.replace("java", "jsp");
		System.out.println(str2);
		
		String str3 = "345677238472";
		System.out.println(str3.substring(5, 9));
		System.out.println(str3.replace(str3.substring(5,9), "****"));
	}
}
