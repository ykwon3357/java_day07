package java_day07;

public class Ch03Ex28 {
	static int[][] arr = new int[5][5];
	static int num = 1;

	public static void printArr(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf((arr[i][j] == 0) ? "   " : "%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	/*
	 * 12345
	 *  678
	 *   9
	 *   
	 * 1
	 * 2 6   10
	 * 3 7 9 11
	 * 4 8   12
	 * 5
	 * 
	 * 1 2 3 4 5
	 * 6 7 8 9
	 * 101112
	 * 13141516
	 * 
	 * 1 2 3 4 5
	 *16171819 6
	 *15242520 7
	 *14232221 8
	 *13121110 9
	 *         
	 * 
	 */
	public static void main(String[] args) {
		int a=1,b=1,start=0,end=5,temp,cnt=5;
		for(int i=0;i<9;i++){
		
			
		}
	}
	public static void homework3(String[] args) {
		int mid=0;
		for (int i = 0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length-mid;j++){
				arr[i][j] = num++;
			}
			mid = (i < 2) ? ++mid : --mid;
		}

		printArr(arr);
		
	}
	public static void homework2(String[] args) {
		int start = 0, end = 4;

		for (int i = 0; i < arr.length; i++) {
			for (int j = start; j <= end; j++) {
				arr[j][i] = num++;
			}
			start = (i < 2) ? ++start : --start;
			end = (i < 2) ? --end : ++end;
		}

		printArr(arr);

	}

	public static void homework1(String[] args) {
		int start = 0, end = 4;

		for (int i = 0; i < arr.length; i++) {
			for (int j = start; j <= end; j++) {
				arr[i][j] = num++;
			}
			start = (i < 2) ? ++start : --start;
			end = (i < 2) ? --end : ++end;
		}

		printArr(arr);
	}

	public static void test5(String[] args) {
		test4();

		num = 1;
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 4 - i; j < arr.length; j++) {
				arr[i][j] = num++;
			}
		}

		printArr(arr);
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr.length; j++) {
		// System.out.printf((arr[i][j]==0)?" ":"%3d",arr[i][j]);
		// }
		// System.out.println();
		// }

	}

	public static void test4() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

		// printArr(arr);
	}

	public static void test3(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[(i % 2 == 0) ? j : 4 - j][i] = num++;
			}
		}

		printArr(arr);
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[i].length; j++) {
		// System.out.printf("%3d", arr[i][j]);
		// }
		// System.out.println();
		// }
	}

	public static void test2(String[] args) {
		// 5행5열 ㄹ자
		int[][] arr = new int[5][5];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][(i % 2 == 0) ? j : 4 - j] = num++;
			}
		}

		// for (int i = 0; i < arr.length; i++) {
		// if (i % 2 == 0) {
		// for (int j = 0; j < arr[i].length; j++) {
		// arr[i][j] = num++;
		// }
		// } else {
		// for (int j = arr[i].length - 1; j >= 0; j--) {
		// arr[i][j] = num++;
		// }
		// }
		// }

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

	public static void test1(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
