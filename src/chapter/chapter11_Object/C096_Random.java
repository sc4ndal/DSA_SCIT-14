package chapter.chapter11_Object;

import java.util.Random;

public class C096_Random {
	
	public static void main(String[] args) {
		/*
		 * [난수 생성]
		 *
		 * 1. Math.random()
		 *    - 0.0 이상 1.0 미만의 double 값 반환
		 *
		 * 2. Random 클래스
		 *    - 다양한 형태의 난수를 만들 때 사용
		 *    - nextInt(10) -> 0 이상 10 미만 (0 ~ 9)
		 */
		
		System.out.println("=== Math.random() ===");
		for (int i = 0; i < 3; i++) {
			System.out.println(Math.random());
		}
		
		System.out.println("\n=== Math.random()으로 1 ~ 10 정수 만들기 ===");
		for (int i = 0; i < 3; i++) {
			System.out.println((int)(Math.random() * 10) + 1);
		}
		
		System.out.println("\n=== Random 클래스 : 0 ~ 9 ===");
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			System.out.println(r.nextInt(10));
		}
		
		System.out.println("\n=== 사용자 정의 메서드 : 5 ~ 10 ===");
		for (int i = 0; i < 3; i++) {
			System.out.println(getRandom(5, 10));
		}
	}
	
	// a 이상 b 이하의 난수 반환
	static int getRandom(int a, int b) {
		return (int)(Math.random() * (b - a + 1)) + a;
	}
}