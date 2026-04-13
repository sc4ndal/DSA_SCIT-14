package chapter.chapter05_Method;

public class C044_Overloading {
	public static void main(String[] args) {
		/*
		[오버로딩(Overloading)]
		- 같은 일므의 메서드를 여러개 정의하는 것(다형성)
		
		[조건]
		1. 메서드 이름이 같아야한다.
		2. 파라미터 개수 or 타입 or 순서가 달라야한다.
		 */
		
		methodTest(5);
		methodTest(5,3.14);
		methodTest(3.14,9);
		System.out.println(methodTest(30,12));
		System.out.println(methodTest(6.9,9.6));
		
	}
	
	// 1. 파라미터 1개
	static void methodTest(int a) {
		System.out.println("int 1개 전달 : " + a);
	}
	
	// 2. 파라미터 개수/ 타입
	static void methodTest(int a, double b) {
		System.out.println("int + double 합 : " + (a + b));
	}
	
	// 3. 파라미터 순서 차이
	static void methodTest(double a, int b) {
		System.out.println("double + int 합 : " + (a * b));
	}
	
	// 4. 파라미터 타입차이
	static int methodTest(int a, int b) {
		return (a > b) ? a : b;
	}
	
	// 5. 파라미터 타입차이
	static double methodTest(double a, double b) {
		return (a > b) ? a : b;
	}
}
