package practice.chapter04_Loop;

public class Loop_Example07 {
	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) { // 5 4 3 2 1
			for (int j = 1; j <= 5; j++) { // 1 2 3 4 5
				if (i>j) { // i가 j보다 클 때 공백
					System.out.print(" ");
				} else {
					System.out.print("*"); // j가 i 이상일때
				}
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		System.out.println("repeat");
		for (int i = 1; i <= 5; i++) {
			System.out.print(" ".repeat(5-i)); // 5-i 숫자 만큼 공백 찍음
			System.out.println("*".repeat(i)); // i 숫자 만큼 별 찍고 줄 바꿈
		}
		System.out.println();
		/*
		printf 출력 서식
			%b : boolean
			%d : 정수 int
			%f : 실수 double
			%c : 문자형 char
			%s : 문자열 String
		 */
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%5s\n", "*".repeat(i)); // 오른쪽 정렬
//			System.out.printf("%-5s\n", "*".repeat(i)); // 왼쪽 정렬
		}
		
		System.out.println("초간단");
		for (int i = 5; i > 0; i--) {
			System.out.printf("%5s\n","*".repeat(i));
		}
		System.out.println("===========================");
		//===========================
		System.out.println("1");
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				if (i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("2");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i<=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//======================================
//		System.out.println();
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5-i ; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//======================================
//		System.out.println();
//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j <= 5; j++) {
//				if (i > j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
	
	}
}
