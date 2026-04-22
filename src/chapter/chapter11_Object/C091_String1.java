package chapter.chapter11_Object;

public class C091_String1 {
	
	public static void main(String[] args) {
/*
		String 문자열
			- 문자를 여러 개 묶어 표현하는 참조형 타입
			- 자바에서 문자열은 매우 자주 사용된다.
		
		출력 방법
			- print()   : 줄바꿈 없이 출력
			- println() : 줄바꿈 하여 출력
			- printf()  : 서식을 지정하여 출력
			- String.format() : 서식이 적용된 문자열 생성
		
		자주 쓰는 탈출 문자
			\n : 줄바꿈
			\t : 탭
			\" : 큰따옴표
			\' : 작은따옴표
*/
		
		// 1. String 생성
		String str1 = new String("아름다운");   // 이해용
		String str2 = "우리나라";               // 권장 방식
		char[] ar = { 'k', 'o', 'r', 'e', 'a' };
		String str3 = new String(ar);          // char 배열 -> 문자열
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// 문자열 길이
		System.out.println("\"대한민국\"의 길이: " + "대한민국".length());
		
		System.out.println();
		
		// 2. 탈출 문자
		System.out.println("줄바꿈\n탭\t큰따옴표(\"), 작은따옴표(\') 출력");
		
		System.out.println();
		
		// 3. printf
		/*
			%b : boolean 형식으로 출력
			%d : 정수 형식으로 출력
			%f : 소수점 형식으로 출력
			%c : 문자형식으로 출력
			%s : 문자열 형식으로 출력
			%o : 8진수 정수의 형식으로 출력
			%x : 16진수 정수의 형식으로 출력
		 */
		int i = 123;
		double d = 3.14159265;
		String str4 = "문자열";
		
		System.out.printf("i = %d, d = %.2f, str = %s\n", i, d, str4);
		System.out.printf("순서 변경: str = %3$s, d = %2$f, i = %1$d\n", i, d, str4);
		
		System.out.println();
		
		// 4. 폭 / 정렬 / 자리수
		System.out.printf("__%d__\n", i);      // 기본
		System.out.printf("__%5d__\n", i);     // 폭 5, 오른쪽 정렬
		System.out.printf("__%-5d__\n", i);    // 폭 5, 왼쪽 정렬
		System.out.printf("__%05d__\n", i);    // 빈자리를 0으로 채움
		
		System.out.printf("__%.2f__\n", d);    // 소수점 2자리
		System.out.printf("__%8.4f__\n", d);   // 전체 폭 8, 소수점 4자리
		
		System.out.println();
		
		// 5. String.format
		String formattedStr = String.format("안녕 %s!", "하세요");
		System.out.println(formattedStr);
	}
}