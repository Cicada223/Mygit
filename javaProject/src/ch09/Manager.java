package ch09;

public class Manager extends Employee {
	public void input(int num, String name, String adress, String email, 
			String rrn, int salary ) {
		super.input(num, name, adress, email, rrn, salary);
	}
	//
	public void print() {
		System.out.println("================================");
		System.out.println(
		"사번:"+getNum()+"\n"+
		"이름 : "+name+"\n"+
		"주소 : "+adress+"\n"+
		"이메일 : "+email+"\n"+
		"주민번호 : "+getRrn()+"\n"+
		"연봉 : "+salary+"\n"+
		"보너스 : "+(salary*0.3));
		System.out.println("================================");
	}
}
