package chapter.chapter00_basic;

public class C003_VariableName {
	public static void main(String[] args) {
		/*
			[변수 명명규칙]
			1. 변수의 이름은 영문자(대소문자)나 숫자사용
			2. 특수문자 $ , _ 만 사용가능
			3. 숫자로 시작 불가
			4. 자바에서 사용중인 예약어 불가
			
			[암묵적 규칙]
			1. 클래스 이름은 항상 대문자로 시작
			2. 변수 이름은 소문자로 시작
			3. 여러 단어로 이루어진 변수는 대문자 또는 _로 구분(aCase, a_case)
			4. 변수 이름은 의미 있는 단어 사용
		 */
		
		// 올바른 변수명
		int num;
		int num2;
		int korScore;
		int mathScore;
		int totalScore;
		int any_thing;
		
		String studentName; // String은 Class = 참조형 Datatype
		
		// 잘못된 변수명 예시
//		int 1num; -> 숫자 시작불가
//		int if; -> 예약어 사용 불가
//		int student-name; -> 특수기호는 $ , _ 만 사용가능
		
		// 사용 예시
		studentName = "홍길동";
		int age = 20; // 변수 초기화
		
		System.out.println(studentName);
		System.out.println(age);
		
		age=21;
		System.out.println(age);
		
		// 실행 단축키 쉬프트 f10
		
	
	}
}
