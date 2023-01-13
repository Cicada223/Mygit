package ch07;

public class Autcion {
	private String name;
	private String userid;
	private int money;
	private String grade;	
	
	public Autcion () {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getGrade() {
		if (money>=100000) {
			grade = "Gold";
		}else grade = "Silver";
		return grade;
	}
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+getGrade());
	}
	
}
