package ch06;

public class VariantParam {

		public static void main(String[] args) {
			print("java");
			print("java","promram");
			print("java","promram","jsp");
			//print("java","promram","jsp","big","data");
		}
		
		static void print(String ... n) {
			for(int i=0; i<n.length; i++) {
				System.out.println(n[i]);
			}
		}

//		static void print(String a, String b, String c) {
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(c);
//		}
//
//		static void print(String a, String b) {
//			System.out.println(a);
//			System.out.println(b);
//		}
//
//		static void print(String a) {
//			System.out.println(a);
//		}
}
