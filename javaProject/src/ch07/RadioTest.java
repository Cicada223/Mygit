package ch07;

public class RadioTest {
	public static void main(String[] args) {
		Radio r1 = new Radio();
		r1.setName("브리츠 라디오");
		r1.setOnOff(true);
		r1.setChannel(89.1);
		r1.setVolume(12);
		r1.print();
		
		Radio r2 = new Radio();
		r2.setName("아이리버 라디오");
		r2.setOnOff(false);
		r2.setChannel(95.1);
		r2.setVolume(9);
		r2.print();
	}
}
