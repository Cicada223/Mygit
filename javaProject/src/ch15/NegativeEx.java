package ch15;

public class NegativeEx {
	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[3] =20;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			int arr[] = new int [-10];
			
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
