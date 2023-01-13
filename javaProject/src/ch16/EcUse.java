package ch16;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<EC> list = new ArrayList<>();
		
		list.add(new EC(1234, "2023-01-04", "하이트맥주", "삼성", "3791882468", 55900));
		list.add(new EC(2345, "2022-12-12", "꼬깔콘", "롯데", "3872875568", 23600));
		list.add(new EC(3456, "2023-01-01", "노트북", "현대", "3985297478", 2600000));
		
		map.put("list", list);
		print(map);
	}
	static void print(Map<String,Object> map) {
		ArrayList<EC> list2 = (ArrayList<EC>) map.get("list");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t결제금액");
		System.out.println("---------------------------------------------------------------------");
		for (EC E : list2) {
			System.out.println(E.getNo()+"\t"+E.getOrderDate()+"\t"+E.getProduct()
			+"\t"+E.getCardName()+"\t"+E.getCardNo()+"\t"+String.format("%,d",E.getPay()));
		}
		System.out.println("---------------------------------------------------------------------");
	}
}
