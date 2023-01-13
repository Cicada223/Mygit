package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		String str1="Hello 1234";
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			if(Character.isUpperCase(c)) {
				System.out.println(c+"는 대문자입니다.");
			}else if(Character.isLowerCase(c)) {
				System.out.println(c+"는 소문자입니다.");
			}else if(Character.isDigit(c)) {
				System.out.println(c+"는 숫자입니다.");
			}else System.out.println(c+"는 기타문자입니다.");
		}
		System.out.println("문자 "+Integer.toString(1234)+"입니다.");
		System.out.println("숫자 "+Integer.parseInt("1234")+"입니다.");
		System.out.println("숫자 1234 + 2 = "+(Integer.parseInt("1234")+2)+"입니다.");
	}
}
