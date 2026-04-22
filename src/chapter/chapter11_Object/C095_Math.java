package chapter.chapter11_Object;

public class C095_Math {
	
	public static void main(String[] args) {
		/*
		 * [Math 클래스]
		 *
		 * java.lang.Math 클래스는
		 * 수학 계산에 필요한 상수와 메서드를 제공하는 클래스이다.
		 *
		 * 주요 상수
		 * - Math.E  : 자연로그의 밑 (e ≈ 2.718...)
		 * - Math.PI : 원주율 (π ≈ 3.1415...)
		 *
		 * 주요 메서드
		 * - abs()   : 절대값
		 * - max()   : 최댓값
		 * - min()   : 최솟값
		 * - pow()   : 거듭제곱
		 * - sqrt()  : 제곱근
		 * - floor() : 내림	(무조건 작은 쪽 정수로 내림)
		 * - ceil()  : 올림 (무조건 큰 쪽 정수로 올림)
		 * - round() : 반올림
		 */
		
		System.out.println("=== Math 상수 ===");
		System.out.println("Math.E  = " + Math.E);
		System.out.println("Math.PI = " + Math.PI);
		
		System.out.println("\n=== Math.abs() : 절대값 ===");
		System.out.println("Math.abs(-10) = " + Math.abs(-10));
		System.out.println("Math.abs(10)  = " + Math.abs(10));
		
		System.out.println("\n=== Math.max(), Math.min() : 최댓값 / 최솟값 ===");
		System.out.println("Math.max(7, 3) = " + Math.max(7, 3));
		System.out.println("Math.min(7, 3) = " + Math.min(7, 3));
		
		System.out.println("\n=== Math.pow(), Math.sqrt() : 거듭제곱 / 제곱근 ===");
		System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));
		System.out.println("Math.sqrt(25)  = " + Math.sqrt(25));
		
		System.out.println("\n=== floor / ceil / round / (int) 비교 ===");
		
		double num1 = 1.6;
		double num2 = -1.6;
		
		System.out.println("\n[양수 1.6]");
		System.out.println("Math.floor(1.6) = " + Math.floor(num1)); // 1.0
		System.out.println("Math.ceil(1.6)  = " + Math.ceil(num1));  // 2.0
		System.out.println("Math.round(1.6) = " + Math.round(num1)); // 2
		System.out.println("(int)1.6         = " + (int) num1);      // 1
		
		System.out.println("\n[음수 -1.6]");
		System.out.println("Math.floor(-1.6) = " + Math.floor(num2)); // -2.0
		System.out.println("Math.ceil(-1.6)  = " + Math.ceil(num2));  // -1.0
		System.out.println("Math.round(-1.6) = " + Math.round(num2)); // -2
		System.out.println("(int)-1.6         = " + (int) num2);      // -1
	}
}