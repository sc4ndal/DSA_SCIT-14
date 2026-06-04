package ex;

import java.util.InputMismatchException;
import java.util.Scanner;

class C {
	
	public void calc() throws CustomException {
		int a = 10;
		Scanner sc = new Scanner(System.in);

//		while (true) {
		System.out.print("숫자 입력 > ");
//			try {
		int b = sc.nextInt();
		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			// 강제 예외 발생
//			throw new RuntimeException();
			throw new CustomException("사용자 정의 예외 발생");
		}
		System.out.println("계산 한다?");
		System.out.println(a / b);
		System.out.println("정상처리!");
		System.exit(0);
//	}
//			catch (InputMismatchException e) {
//				System.out.println("숫자 예외 발생");
//				sc.next();
//			} catch (ArithmeticException e) {
//				System.out.println("나누기 예외");
//			} catch (Exception e) {
//				System.out.println("알 수 없는 예외 발생");
//			}
//		}
	}
}

class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}

public class B {
	public static void main(String[] args) throws CustomException {
		// 예외처리 : 예외가 발생했을 때 처리
		// 예외 종류 : 강제 예외(checked Exception),
		// 런타임 예외(unChecked Exception)

//		String str = null;
//		System.out.println(str.equals("hello"));
		C c = new C();
		
		while (true) {
			try {
				c.calc();
				return;
				
			} catch (InputMismatchException e) {
				System.out.println("숫자 입력 예외 발생");
			} catch (ArithmeticException e) {
				System.out.println("나누기 예외 발생");
			} catch (Exception e) {
				System.out.println("기타 예외 발생");
			}
		}
	}
	
}
