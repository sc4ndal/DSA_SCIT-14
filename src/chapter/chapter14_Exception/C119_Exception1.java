package chapter.chapter14_Exception;

/*
	[예외 처리(Exception Handling)]
	프로그램 실행중 발생할 수 있는 오류를 처리해
	프로그램이 비정상적으로 종료되는 것을 막는 것.
 */

public class C119_Exception1 {
	public static void main(String[] args) {
		
		int a = 2;
		int b = 0;
		int c;
		
		System.out.println("프로그램 시작");
		
		// 1. 예외가 발생하는 코드
//		c = a / b;
//		System.out.println("결과 : " + c);
		
		// 2. 조건문으로 예외를 예방
//		if (b != 0) {
//			c = a / b;
//			System.out.println("결과 : " + c);
//		} else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
		// 3. try-catch를 이용한 예외 처리
//		try {
//			System.out.println("나눗셈 시도");
//			c = a / b;
//		} catch (Exception e) {		// -> Exception 타입 e 변수명
//			System.out.println("예외 발생!");
//
//			// 예외 정보 출력
//			e.printStackTrace();
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
		try {
			System.out.println("나눗셈 시도");
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("에러 발생!");
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램 실행 완료");
		
		
	}
}
