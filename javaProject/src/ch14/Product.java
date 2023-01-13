package ch14;

import java.util.Scanner;

public class Product {
	private String num;
	private String name;
	private String manufacturer;
	private int price;
	private int amount;
	private int money;
	private double tax;

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("제품번호 : ");
		num = sc.next();
		System.out.print("제 품 명 : ");
		name = sc.next();
		System.out.print("제 조 사 : ");
		manufacturer = sc.next();
		System.out.print("단    가 : ");
		price = sc.nextInt();
		System.out.print("수    량 : ");
		amount = sc.nextInt();

		money = price * amount;
		tax = money*0.1;
		
		System.out.print("계속 입력하려면 아무 숫자를 입력하시고 그만두려면 -1을 입력하십시오  : ");
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
