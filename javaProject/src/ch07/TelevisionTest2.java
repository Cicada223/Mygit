package ch07;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television myTv = new Television();
		System.out.println(myTv); // 해쉬코드
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		System.out.println("나의 텔레비전의 채널은 "+myTv.channel + "이고 볼륨은 "
				+ myTv.volume + "입니다. ");
		
		Television yourTv = new Television();
		System.out.println(yourTv);
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		System.out.println("당신의 텔레비전의 채널은 "+yourTv.channel+"이고 볼륨은"
				+ yourTv.volume + "입니다. " );
	}
}
