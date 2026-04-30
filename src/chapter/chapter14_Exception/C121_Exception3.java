package chapter.chapter14_Exception;

/*
	[멀티 catch]
	서로 다른 여러개의 예외를 하나의 catch 문에서 동시에 처리할 수 있는 문법
 */

public class C121_Exception3 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		int c;
		int[] ar = {1, 2, 3, 4, 5};
		
		System.out.println("프로그램 시작");
		
		try {
			System.out.println("1. 나눗셈 수행");
			c = a / b;                    // ArithmeticException
			System.out.println("c = " + c);
			
			System.out.println("2. 배열에 값 저장");
			ar[5] = 100;                // ArrayIndexOutOfBoundsException
			
			System.out.println("3. try 블록 끝");
			
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // 적는 순서 상관없이 위 실행 순서 따라 에러 처리
			System.out.println("산술 or 배열 인덱스 예외 발생");
			System.out.println("예외 클래스 : " + e.getClass().getSimpleName());
			System.out.println("메시지 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
		}
		
		System.out.println("프로그램 실행 완료");
	}
}
