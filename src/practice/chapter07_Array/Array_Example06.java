package practice.chapter07_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("받을 로또 게임의 개수를 입력해주세요: ");
		int a = sc.nextInt();
		int[][] num = new int[a][6];
		
		String result = "";
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < 6; j++) {
				int x = (int) (Math.random() * 45+1);
				num[i-1][j] = x;
				Arrays.sort(num[i-1]);
			}
//			num[i-1][j] = Arrays.toString(num[i-1]);
		}
//		for (int[] i : num) {
//			for (int j : i) {
//				System.out.print(j+" ");
//			}
//		}
		System.out.println("""
				===========================
				%s
				""".formatted(result));
		
	}
}
