package chapter.chapter14_Exception;

/*
	[예외 종류]
	1. Checked Exception : 컴파일러가 예외 처리를 강제한다.
		ex. IOException, SQLException, Exception
		- 반드시 try-catch 또는 throws 가 필요
		
	2. Unchecked Exception : 컴파일러가 예외 처리를 강제하진 않음
		ex. RuntimeException, ArithmeticException, NullPointerException
			ArrayIndexOfBoundsException, NumberFormatException ... etc
		- try-catch 없이도 컴파일 가능. (실행 중 오류 발생)
 */
public class C125_ExceptionType {
	public static void main(String[] args) {
		try {
			test1();
		} catch (Exception e) {
			System.out.println("예외 메시지 : "+e.getMessage());
		}
		test2();
	}
	
	// Checked Exception
	static void test1() throws Exception {
		throw new Exception("Checked Exception 발생");
	}
	
	// Unchecked Exception
	static void test2() {
		throw new RuntimeException("Unchecked Exception 발생");
	}
}
