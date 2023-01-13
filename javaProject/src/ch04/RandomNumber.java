package ch04;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("난수의 개수 : ");
		
		int count = scan.nextInt();
		int sum = 0;
		scan.close();
		
		for(int i=0; i<count; i++) {
			int number = generator.nextInt(100); // 0~ 99 난수 발생
			System.out.println("생성된 난수 : " + number);
			sum += number ;
		}
		System.out.println("난수 " +count + "개의 합은 "+ sum);
		
	}

}
