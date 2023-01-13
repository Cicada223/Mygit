package ch04;

public class WhileEx extends Accumulate {

	public static void main(String[] args) {
		int i=1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		//for 문과 비교
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
	}

}
