package chapter.chapter05_Method;

import java.util.Scanner;

public class C043_MethodUsage {
	public static void main(String[] args) {
		// 메서드를 이용해 전체 구구단 출력
//		method();
		System.out.println("=================");
		
		methodEx(); // 전체 출력
		
		// 특정 단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단수 입력 : ");
		int num = sc.nextInt();
		methodEx(num);                // 전체 구구단 출력
	}
	
	public static void method() {
		for (int i = 2; i <=9; i++) {
			System.out.println(i+"단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
	
	public static void methodEx() {
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			methodEx(i);
			System.out.println();
		}
	}
	// 오버로딩
	// 데이터 타입, 순서, 갯수가 달라야함
	public static void methodEx(int num) { // -> methodEx overloading
		for (int i = 1; i <= 9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
}
