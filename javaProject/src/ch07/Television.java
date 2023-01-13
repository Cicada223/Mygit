package ch07;

public class Television {
	//멤버변수 ( 전역변수)
	int channel;
	int volume;
	boolean onOff;// 기본적으로 false
	
	//멤버메소드
	void print() {
		System.out.println("채널은 "+channel + "이고 볼륨은 "+volume+"입니다. ");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}
