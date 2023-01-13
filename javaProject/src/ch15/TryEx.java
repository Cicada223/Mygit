package ch15;

public class TryEx {
	public static void main(String[] args) {
		
		try {
			int[] num= {10,20,30,40,50};
			for(int i=0; i<=num.length; i++) {
				System.out.println(num[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
