package ch12;

public interface Controllable {
	public void turnOn();
	public void turnOff();
	default void refair() {
		System.out.println("장비를 수리한다.");
	}
	default void reset() {
		System.out.println("장비를 초기화한다.");
	}
}
