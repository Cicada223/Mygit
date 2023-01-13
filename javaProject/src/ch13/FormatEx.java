package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {
	public static void main(String[] args) {
		//3자리수 콤마 표시
		//1) String 활용
		int val = 123400000;
		String str = String.format("%,d",val);
		System.out.println(str);
		
		//2) DecimalFormat
		DecimalFormat df = new DecimalFormat("###,###.##");
		String num = df.format(1230000000000.024242);
		System.out.println(num);
		
		//3) NumberFormat
		NumberFormat nf = NumberFormat.getInstance();
		String num2 = nf.format(123000.1234);
		System.out.println(num2);
		
		NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALY);
		String num3 = nf2.format(123000.1234);
		System.out.println(num2);
	}
}
