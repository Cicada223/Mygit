package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p1= new Person();
		p1.showInfo();
		
		Person p2 = new Person("추신수");
		p2.showInfo();
		
		Person p3 = new Person("류현진",191);
		p3.showInfo();
		
		Person p4 = new Person("이정후",185,88);
		p4.showInfo();
	}
}
