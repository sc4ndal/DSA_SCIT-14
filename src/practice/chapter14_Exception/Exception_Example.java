package practice.chapter14_Exception;

import java.util.Scanner;

class LengthException extends Exception {
	public LengthException(String message) {
		super(message);
	}
}

class DashException extends Exception {
	public DashException(String message) {
		super(message);
	}
}

public class Exception_Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("주민번호 입력 > ");
				String num = sc.nextLine();
				
				checkNum(num);
				
				System.out.println("정상 입력 완료");
				break;
			} catch (LengthException l) {
				System.out.println(l.getMessage());
			} catch (DashException d) {
				System.out.println(d.getMessage());
			} catch (Exception e) {
				System.out.println("알 수 없는 오류 발생");
			}
		}
		
//		System.out.println("프로그램 종료");
//		System.exit(0);
		
	}
	
	public static void checkNum(String num) throws LengthException, DashException {
			if (num.length() != 14) {
				throw new LengthException("14자리 입력하세요!");
			}
			if (num.charAt(6) != '-') { // num.indexOf("-") != 6
				throw new DashException("- 를 넣어주세요!");
			}
		
	}
}
