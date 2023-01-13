package ch05;

public class Array3Dim {
	public static void main(String[] args) {
		String[][][] subject= {{
			{"JS01","AL02","PY03","DS04"}
		,{"JSP","알고리즘","파이썬","자료구조"}
		,{"홍길동","강감찬","이순신","이몽룡"}},
				{
			{"CS01","CS02","CS03","CS04"}
			,{"생활영어","경제학","생활체육","음악"}
			,{"김영철","정경제","최배달","조수민"}
			}};
		
		for(int i=0; i<subject.length; i++) {
			for(int j=0; j<subject[i].length; j++) {
				for(int k=0; k<subject[i].length; k++) {
					System.out.println("["+i+"]["+j+"]["+k+"] : " + subject[i][j][k]);
				}
			}
			System.out.println("===============================");
		}
	}
}
