package ch12;

class Outer {
	class InstanceInner {
		int a = 100;
	}
	static class StaticInner {
		int a = 200;
		static int b=300;
	}
	void myMethod() {
		class LocalInner {
			int a = 400;
		}
		LocalInner i = new LocalInner();
		System.out.println("i.a : "+i.a);
	}
}



public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner i =  oc.new InstanceInner();
		
		System.out.println("i.a : "+i.a);
		System.out.println("Outer.StaticInner.b : "+ Outer.StaticInner.b);
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a : "+si.a);
		
		oc.myMethod();
		
	}
}
