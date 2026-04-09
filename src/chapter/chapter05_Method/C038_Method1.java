package chapter.chapter05_Method;

import java.util.Scanner;

public class C038_Method1 {
	public static void main(String[] args) {
		/*
		
		[method]
		메서드를 호출할 때는 메서드가 정의된 형식에 맞춰 호출
		1. 매개변수(parameter)가 없다면 값 없이 호출
		2. 매개변수가 있다면 자료형, 개수, 순서에 맞게 값을 전달해야 함
		3. 반환값이 있는 메서드는 하나의 값처럼 사용 가능
		
		- 구조
		접근제어자(public/private) (static) 반환타입 메서드명(자료형 변수명, 자료형 변수명){
			실행문
			return 값;
		}
		 */
		
		// 1. 메서드를 미호출
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("1~10 합 = "+sum);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1~숫자2까지의 합 method 호출");
		System.out.print("숫자1 입력 : ");
		int a = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		int b = sc.nextInt();
		// 2. 메서드 호출
		System.out.println("=== 메서드 호출 ===");
		System.out.println(""+a+"부터 "+b+"까지의 합 = "+calcSum(a, b));
	}
	
	public static int calcSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
	
}
