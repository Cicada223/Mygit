package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		int play = 0;
		while (play >= 0) {
			System.out.println("제품정보를 입력하세요");

			Product p = new Product();
			p.input();

			list.add(p);

			play = sc.nextInt();
			if (play <= -2) {
				play = -play;
			}
		}

		System.out.println("====================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)\t부가가치세");
		System.out.println("----------------------------------------------------");
		for (Product pro : list) {
			System.out.println(pro.getNum() + "\t" + pro.getName() + "\t" + pro.getManufacturer() + "\t"
					+ String.format("%,d", pro.getPrice()) + "\t" + pro.getAmount() + "\t"
					+ String.format("%,d", pro.getMoney()) + "\t" + String.format("%,.0f", pro.getTax()));
		}
		System.out.println("====================================================");
	}
}
