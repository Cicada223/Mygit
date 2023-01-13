package ch14;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new TreeSet<>(); //Treeset ABC 정렬 단 입력과정에서 계속 Sorting함
		//Set은 중복값을 허용하지 않음
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea");		//중복값 처리 안됨
		System.out.println(hs);	//순서대로 저장되지 않음
		for(String str : hs) {
			System.out.println(str);
		}
		
		System.out.println("=============================");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {//다음 요소가 있으면 true
			System.out.println(it.next());
		}
	}
}
