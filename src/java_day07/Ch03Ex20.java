package java_day07;

import java.util.Arrays;

public class Ch03Ex20 {

	public static void main(String[] args) {
		// 배열 선언 방식1: 선언
		// java.lang보다 java.util에 있는게 성능이 더 좋음.
		  String[] arr ={"","a"};
		  String[] arr2 = Arrays.copyOf(arr, arr.length);
		  System.out.println(Arrays.toString(arr2));

	}

}
