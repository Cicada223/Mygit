package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list =new ArrayList<>();
		list.add(new Student("202301", "김철수", "국사", 1, "박교수"));
		list.add(new Student("202302", "박찬호", "영문", 2, "최교수"));
		list.add(new Student("202303", "송명호", "전산", 3, "김교수"));
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		
		for (int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.print(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()
			+"\t"+s.getYear()+"\t"+s.getProfessor()+"\n");
		}
		//for~each문(향상된 for문)
		for (Student s : list) {
			System.out.print(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()
			+"\t"+s.getYear()+"\t"+s.getProfessor()+"\n");
		}
		
	}
}
