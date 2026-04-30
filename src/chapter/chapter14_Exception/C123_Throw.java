package chapter.chapter14_Exception;

/*
	[throw]
	직접 예외를 발생시키는 메서드
	
 */

import java.util.Scanner;

public class C123_Throw {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		try {
			if (age < 0) {
				throw new Exception("나이는 음수가 될 수 없습니다.");
			}
			System.out.println("입력한 나이 : " + age);
		} catch (Exception e) {
			System.out.println("예외 발생!");
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
}
