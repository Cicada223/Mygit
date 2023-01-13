package ch03;
import java.util.Scanner;
public class RectangleTest {

	public static void main(String[] args) {
		
		int width, length;
		double area;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("직사각형의 가로 길이 : ");
		width = scan.nextInt();
		System.out.println("직사각형의 세로 길이 : ");
		length = scan.nextInt();
		scan.close();
		
		area = width*length;
		System.out.println("직사각형의 넓이는 "+ area + "입니다.");
	}

}
