package java_day07;

import java.util.Random;
import java.util.Scanner;

public class Ch03Ex24 {
	public static final int 가위 =1;
	public static final int 바위 =2;
	public static final int 보 =3;
	
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main(String[] args) {
		//상수의 사용
		//enum은 JDK 1.5 이상에서 사용
		//클래스화 된 상수 열거형
		//서로 관련 있는 상수들을 모아 심볼릭한 명칭의 집합으로 정의한 것.
		//Enum 클래스형을 기반으로 클래스형 선언 가능
		//새 열거형을 만들면 내부적으로 Enum 클래스형이 만들어 진다.
		
		//가위-바위-보 switch case
		//1:가위, 2:바위, 3:보
		
		
		System.out.println(":::::가위 바위 보 게임:::::");
		System.out.println("1)가위 2)바위 3)보");
		
		String[] arr={"","가위","바위","보"};
		System.out.println("사용자: ");
		int userNum=sc.nextInt();
		
		while(userNum<가위||userNum>보){
			System.out.println("잘못 입력");
			System.out.println("사용자: ");
			userNum=sc.nextInt();
		}
		
		int sysNum=가위+random.nextInt(보);
		System.out.println("사용자: "+arr[userNum]);
		System.out.println("시스템: "+arr[sysNum]);
		
		if(userNum==sysNum){
			System.out.println("결과: 비겼습니다!");
		}else{
		
		switch(userNum){
		case 가위:
			switch(sysNum){
			case 바위: System.out.println("시스템 승!");break;
			case 보: System.out.println("사용자 승!");break;
			}break;
		case 바위:
			switch(sysNum){
			case 보: System.out.println("시스템 승!");break;
			case 가위: System.out.println("사용자 승!");break;
			}break;
		case 보:
			switch(sysNum){
			case 가위: System.out.println("시스템 승!");break;
			case 바위: System.out.println("사용자 승!");break;
			}
		
		}
		
		}
		

	}

}
