package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a = 10;
		Object obj = 20;
		a = (Integer)obj;
		System.out.println(a);
		
		Object[] obj2 = {100,100.5,true,"hello",'A'};
		
		System.out.println(obj2);
		for(Object o : obj2) {
			System.out.println(o);
		}
	}
	
}
