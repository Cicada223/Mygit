package ch12;
import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {
			
			@Override
			public void takeOff() {
				System.out.println("take off");				
			}
			
			@Override
			public void land() {
				System.out.println("land");
			}
			
			@Override
			public void fly() {
				System.out.println("fly");
			}
		};
		f.takeOff();
		f.land();
		f.fly();
	}
}
