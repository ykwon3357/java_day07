package java_day07;

public class Ch03Ex22 {

	public static void main(String[] args) {
		int[] scoreArr={95,80,100,65,60,70,90,95,100,30};
		int total=0;
		
		//scoreArr의 3~6번째 점수 total 누적
		
		for(int i=2;i<6;i++){
			total+=scoreArr[i];
			System.out.printf(scoreArr[i]+"%s",(i==5)?"=":"+");
		}
		System.out.println(total);
			

	}

}
