package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map<String, Object> map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+
		s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		List<Student> list = new ArrayList<>();
		list.add(new Student("202301", "kim", "전산", 1, "park"));
		list.add(new Student("202201", "choi", "영문", 2, "hong"));
		list.add(new Student("202001", "lee", "경제", 3, "min"));
		map.put("list", list); //맵에 리스트 추가
		print(map);
	}
}
