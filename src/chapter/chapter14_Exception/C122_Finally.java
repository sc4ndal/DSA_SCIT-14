package chapter.chapter14_Exception;

/*
	[finally]
	finally 블록은 예외 발생 여부와 상관없이 항상 마지막에 실행됨
	
	주 사용 목적
	1. 마무리 작업
	2. 자원 해제(close)
 */

import java.util.Scanner;

public class C122_Finally {
	public static void main(String[] args) {
		// 1. finally 기본 예시
		System.out.println("=== finally ===");
		
		try {
			System.out.println("접속");
			System.out.println("전송");
//			throw new Exception("강제로 예외 발생");
		} catch (Exception e) {
			System.out.println("catch 실행 : " + e.getMessage());
		} finally {        // 예외 상관없이 무조건 실행
			System.out.println("해제");
		}
		System.out.println();
		
		// 2. finally 에서 자원 해제
		System.out.println("=== Scanner close 예제 ===");
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			System.out.println("입력한 값: " + num);
			
//			sc.close();
		} catch (Exception e) {
			System.out.println("입력 예외 발생");
		} finally {
			if (sc != null) {
				sc.close();
				System.out.println("Scanner 해제 완료");
			}
		}
		
		// 3. try-with-resources
		// 자원을 사용하는 객체를 자동으로 close() 해주는 문법
		System.out.println("=== try-with-resources 예제===");
		
		try (Scanner sc2 = new Scanner(System.in)) {
			System.out.print("숫자 입력 : ");
			int num = sc2.nextInt();
			System.out.println("입력한 값 : " + num);
		} catch (Exception e) {
			System.out.println("입력 예외 발생");
		}finally {
			System.out.println("예외 발생 여부 관계없이 실행");
		}
		
	}
}
