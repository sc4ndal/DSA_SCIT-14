package practice.chapter04_Loop;

import java.util.Scanner;

public class Loop_Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("숫자 입력: ");
		int a = sc.nextInt();
		System.out.print("숫자 입력: ");
		int b = sc.nextInt();
		
		if (a < b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
			System.out.println(sum);
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
			System.out.println(sum);
		} else {
			System.out.println("두 수는 같은 숫자입니다.");
		}
	}
}
