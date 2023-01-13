package ch09;

public class Employee {
	private int num;		 //사번
	public String name;		 //이름
	String adress;			 //주소
	String email;			 //이메일
	protected int salary; 	 //월급
	private String rrn;		 //주민번호
	//
	public Employee() {}
	
	public Employee(int num, String name, String adress, String email, 
			 String rrn,int salary) {
		super();
		this.num = num;
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.salary = salary;
		this.rrn = rrn;
	}
	public void input(int num, String name, String adress, String email, 
			String rrn, int salary ) {
		this.num = num;
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.salary = salary;
		this.rrn = rrn;
	}
	//get set
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}


	
}
