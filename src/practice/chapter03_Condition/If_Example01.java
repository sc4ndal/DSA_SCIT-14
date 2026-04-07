package practice.chapter03_Condition;

import java.util.Scanner;

public class If_Example01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		
		System.out.print("가로 입력 : ");
		a = sc.nextInt();
		System.out.print("세로 입력 : ");
		b = sc.nextInt();
		result = a*b;
		
		if (a > 0 && b > 0) {
			if (a == b) {
				System.out.println("정사각형의 넓이는 " + result + "입니다");
			} else {
				System.out.println("직사각형의 넓이는 " + result + "입니다");
			}
		} else {
			System.out.println("두 숫자 모두 1이상 입력 필요");
		}
	}
}
