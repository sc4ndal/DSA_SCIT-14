package chapter.chapter14_Exception;

/*
	[다중 예외 처리]
	하나의 try 블럭 안에는 여러 종류의 예외가 발생할 수 있음
	여러개의 catch문으로 발생한 예외 타입을 각각 다르게 처리할 수 있음
	
	[예외 처리 메서드]
	1. printStackTrace()
		- 예외가 발생한 위치와 호출 흐름을 출력
	2. getMessage()
		- 예외에 대한 간단한 메시지를 문자열로 반환
	
 */
public class C120_Exception2 {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
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
			
		} catch (ArithmeticException e) {
			System.out.println("[ArithmeticException 발생]");
			System.out.println("메시지 : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[ArrayIndexOutOfBoundsException 발생]");
			System.out.println("예외 클래스 : " + e.getClass().getSimpleName());
		} catch (Exception e) {
			System.out.println("[기타 예외 발생]");
			System.out.println("메시지 : "+e.getMessage());
		}
		
		System.out.println("프로그램 실행 완료");
		
	}
}
