package ch05;

public class GetMinMax {

	public static void main(String[] args) {
		int [] MinMax = {79,88,91,33,100,55,95};
		int Min, Max;
		Min = MinMax[0];
		Max = MinMax[0];
		
		for(int i=0; i<MinMax.length; i++) {
			if (Min > MinMax[i]) 
				Min=MinMax[i] ;
		}
		for(int i=0; i<MinMax.length; i++) {
			if (Max < MinMax[i]) 
				Max=MinMax[i] ;
		}
		System.out.println("출력결과 : ");
		System.out.println("최대값 : "+Max);
		System.out.println("최소값 : "+Min);
	}

}
