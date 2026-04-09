package chapter.chapter05_Method;

public class C039_Method2 {
	public static void main(String[] args) {
		
		// methodA 호출
		methodA();
		System.out.println();
		
		// methodB 호출
		String resultB = methodB();
		System.out.println("methodB 반환값 : "+resultB);
		System.out.println();
		
		// methodC 호출
//		int resultC = methodC(1,2); // methodC는 void라서 return 값이 없어서 error
		methodC(1,2);
		System.out.println();
		
		// methodD 호출
		int resultD = methodD(1,2);
		System.out.println("methodD 반환값 : "+resultD);
		System.out.println();
	}
	
	// 메서드 정의
	// 1. 매개변수 X, 반환값 X
	// void -> 반환값 없음
	public static void methodA() {
		System.out.println("methodA 호출");
	}
	
	// 2. 매개변수 X, 반환값 0
	public static String methodB() {
		System.out.println("methodB 호출");
		String str = "hello world";
		return str;
	}
	
	// 3. 매개변수 O, 반환값 X
	public static void methodC(int numA, int numB) {
		System.out.println("methodC 호출");
		System.out.println("전달 받은 값 : "+numA+", "+numB);
		System.out.println("결과 출력 : "+numA+numB);
	}
	
	// 4. 매개변수 O, 반환값 O
	public static int methodD(int numA, int numB) {
		System.out.println("methodD 호출");
		System.out.println("전달 받은 값 : "+numA+", "+numB);
		int sum = numA + numB;
		return sum;
	}
}
