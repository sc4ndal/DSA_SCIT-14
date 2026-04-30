package chapter.chapter14_Exception;

/*
	[throws]
	throws는 메서드에서 발생할 수 있는 예외를
	호출한 쪽으로 떠넘기는 키워드
 */
public class C124_Throws {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {
			testMethod();			// -> 예외가 들어있는 메서드 실행
		} catch (Exception e) {
			System.out.println("main에서 예외처리");
			System.out.println("메시지 : "+e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
	
	private static void testMethod() throws Exception {
		System.out.println("testMethod() 실행");
		
		throw new Exception("testMethod에서 예외 발생");		// -> 강제 예외 발생
		
//		try {
//			// 예외 직접 발생
//			throw new Exception("testMethod에서 예외 발생");
//
//		} catch (Exception e) {
//			System.out.println("예외 처리 메시지 : "+e.getMessage());
//		}
		
	}
}
