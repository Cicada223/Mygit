package ch07;

public class Member {
	private String name;
	private String userid;
	private int money;
	private String grade;	
	
	public Member(String name, String userid, int money) {
		this.name = name;
		this.userid = userid;
		this.money = money;
		if (money>=100000) {
			grade = "Gold";
		}else grade = "Silver";
	}
	
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
	}
}
