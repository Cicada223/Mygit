package ch07;

public class Radio {
	private String name;
	private boolean onOff;
	private double channel;
	private int volume;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getOnOff() {
		return onOff;
	}
	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	public double getChannel() {
		return channel;
	}
	public void setChannel(double channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void print() {
		System.out.println("["+name+"]");
		if (onOff == true ) {
			System.out.println("라디오가 켜져있습니다.");
		}else 
			System.out.println("라디오가 꺼져있습니다.");
		System.out.println("현재 채널은 "+channel+" 입니다.");
		System.out.println("볼륨은 "+volume+" 입니다."+"\n");
	}
}
