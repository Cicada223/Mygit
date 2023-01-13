package ch11;

public class VehicleUse {
	public static void main(String[] args) {
		System.out.println("Car SpeedUP");
		System.out.println("Car SpeedDown");
		System.out.println("Car Handling");

		Vehicle v = new Plane();
		v.speedUp();
		v.speedDown();
		v.handle();
		v = new Boat();
		v.speedUp();
		v.speedDown();
		v.handle();
		
	}
}
