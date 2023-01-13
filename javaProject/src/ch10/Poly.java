package ch10;
class K {
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}

class V extends K {
	int a = 20;
	@Override
	public void print() {
		System.out.println(a);
	}
}


public class Poly {
	public static void main(String[] args) {
		V a = new V();
		a.print();
		K b = new K();
		b.print();
		
		K c = new V ();
		c.print();
		System.out.println("c intstanceof V ? "+ ( c instanceof V));
	}
}
