package ch13;

import java.util.Calendar;
import java.util.Date;

public class Cal {
	public static void main(String[] args) {
		//캘린더 인스턴스 생성은 new로 만들 수 없음
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);		// 월은 0~11
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR)); 		// 12시간제
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24시간제
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		//오전 0, 오후 1
		System.out.println(cal.get(Calendar.AM_PM));
		if(cal.get(Calendar.AM_PM) ==0 ) {
			System.out.println("오전");
		} System.out.println("오후");
		
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil = "";
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:yoil="일요일";break;
		case 2:yoil="월요일";break;
		case 3:yoil="화요일";break;
		case 4:yoil="수요일";break;
		case 5:yoil="목요일";break;
		case 6:yoil="금요일";break;
		case 7:yoil="토요일";break;
		default:break;
		}
		System.out.println("오늘은 "+yoil+"입니다.");
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		Date date = cal.getTime();
		//deprecated 메소드에서 가급적 사용을 자제하라는 뜻
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());

	}
}
