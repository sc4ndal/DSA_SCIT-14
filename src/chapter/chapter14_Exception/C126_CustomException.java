package chapter.chapter14_Exception;

import java.util.Scanner;

/*
	 [사용자 정의 예외(CustomException)]
	 자바에는 많은 예외 클래스가 존재하지만,
	 프로그램의 상황에 맞는 예외를 직접 만들 수 있다.
 */
class ScoreException extends Exception {
	public ScoreException(String message) {
		super(message);
	}
}

public class C126_CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 > ");
		int score = sc.nextInt();
//		checkScore(score);
		
		try {
			checkScore(score);
			System.out.println("입력한 점수 : " + score);
		} catch (ScoreException s) {
			System.out.println("Error! 사용자 정의 예외 발생");
			System.out.println(s.getMessage());
		}
		System.out.println("프로그램 종료");
		sc.close();
		
	}
	
	// 점수 검사 메서드
//	public static void checkScore(int score) {
//		if (score < 0 || score > 100) {
//			//사용자 정의 예외 발생
//			try {
//				throw new ScoreException("점수는 0부터 100사이여야 합니다.");
//			} catch (ScoreException s) {
//				System.out.println("Error! " + s.getMessage());
//			}
//		} else {
//			System.out.println("점수 : " + score);
//		}
//
//	}
	//================위랑 동일===================
	public static void checkScore(int score) throws ScoreException {
		if (score < 0 || score > 100) {
			throw new ScoreException("점수는 0부터 100사이여야 합니다.");
		}
	}
}
