package java_day07;

import java.util.Scanner;

public class Ch03Ex23 {
	static int[] days={ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int total=0, month=0, day=0;
	static Scanner sc = new Scanner(System.in);
	
	static void print(String msg){
		System.out.print(msg);
	}
	
	public static void main(String[] args) {
		//100일 후
		//100일 될때까지 누적-100이 넘으면 계산한 달에서 넘치는 만큼 빼줌
		print("월 입력: ");
		month = sc.nextInt();
		print("일 입력: ");
		day = sc.nextInt();
		
		//해당 월의 남은 날짜를 누적
		total = days[month-1] - day;
		int i=0;
		for(i=month;total<100;i++){
			i=i%12;
			total+=days[i];
		}
		int nextMonth =i;
		int nextDay = days[i-1] - (total-100);
 		System.out.printf("%d월 %d일의 100일 후는 %d월 %d일 입니다.",month,day,nextMonth,nextDay);

	}
	public static void test05(String[] args) {
		//100일 후
		//total에 100넣고 빼기
		
		print("월 입력: ");
		month = sc.nextInt();
		print("일 입력: ");
		day = sc.nextInt();
		
		total=100-(days[month-1]-day);
		int i = month%12;
		
		while(days[i]<total){
			total-=days[i++];
			i=i%12;
		}
		int nextDay = total;
		int nextMonth = i+1;
		/*
		total+=100+day;
		for(int i=0;i<month-1;i++)
			total+=days[i];
		
		total=(total>365)?total-365:total;
		
		int i=0;
		while(total>0){
			total-=days[i];
			i++;
		}
		total+=days[i-1];
		int nextmonth = i;
		*/
		System.out.printf("%d월 %d일의 100일 후는 %d월 %d일 입니다.",month,day,nextMonth,total);
	}
	
	public static void test4(String[] args) {
		print("월 입력: ");
		month = sc.nextInt();
		print("일 입력: ");
		day = sc.nextInt();
        
		total=days[month-1]-day;
		for(int i=month;i<days.length;i++){
			total+=days[i];
		}
		
		/*total=day;
		
		for(int i=0;i<month-1;i++){
			total+=days[i];
		}
		total=365-total;*/
		
		System.out.printf("1년은 %d일 남았습니다.",total);
	}
	public static void test3(String[] args) {
		print("월 입력: ");
		month = sc.nextInt();
		print("일 입력: ");
		day = sc.nextInt();
		total=day;
		
		for(int i=0;i<month-1;i++){
			total+=days[i];
		}
		
		System.out.printf("1월부터 %d월 %d일까지는 총 %d일입니다.",month,day,total);
	}
	public static void test2(String[] args) {
		// 월을 입력 받아서 해당월의 날짜 수를 출력한다.
		print("월 입력: ");
		month = sc.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.",month,days[month-1]);
	}
	public static void test1(String[] args) {
		
		for(int i=0;i<days.length;i++){
			total += days[i];
		}
		
		System.out.println(total);
	}
}
