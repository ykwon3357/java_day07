package java_day07;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex26 {
	//과제 중복문제 해결방법 3가지
	public static Random rand = new Random();

	
	public static void main(String[] args) {
		int[] lotto = new int[3];
		
		
		
		for(int i=0;i<3;i++){
			lotto[i] = 1+ rand.nextInt(3);
			
			
			for(int j=i-1;j>=0;j--)
				
				while(true){
					if(lotto[i]!=lotto[j])
						break;
					
					lotto[i]=1+ rand.nextInt(3);
				}
		}
		
		
//		for(int i=0;i<4;i++){
//			lotto[i] = 1+ rand.nextInt(4);
//			//중복 해결 3가지\
//			}
//				
//				while(lotto[1]==lotto[0]){
//					lotto[1]=1+ rand.nextInt(4);
//				}
//				while(lotto[2]==lotto[0]||lotto[2]==lotto[1]){
//					lotto[2]=1+ rand.nextInt(4);
//				}
//				while(lotto[3]==lotto[0]||lotto[3]==lotto[1]||lotto[3]==lotto[2]){
//					lotto[3]=1+ rand.nextInt(4);
//				}
		
		
		System.out.println(Arrays.toString(lotto));

	}

}

