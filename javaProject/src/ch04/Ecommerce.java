package ch04;
import java.util.Scanner;
public class Ecommerce extends Holiday {

	public static void main(String[] args) {

		String name = "";
		int price = 0;     // 구매금액
		int point = 0;     // 포인트
		int point_use = 0; // 포인트 사용액
		int fee = 0;       // 배송료
		int pay ;          // 실제 결제금액
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("구매금액 : ");
		price = scan.nextInt();
		System.out.print("보유포인트 : ");
		point = scan.nextInt();
		scan.close();
		
		if (price < 20000) {
			fee = 2500;
		}
		if (point >= 10000) {
			point_use = point;
			pay = price + fee - point ;
		}else {
			pay = price + fee;
		}
		
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
		
	}

}
