package chapter.chapter01_Data;

import java.util.Scanner;

public class C011_TextBlock {
	
	public static void main(String[] args) {
	
		/*
		[텍스트 블록(Text Block)]
		java 15 ver 이상
		"""로 여러 줄 문자열 작성할 수 있음
		 
		 특징
		 1. 여러줄 문자열 쉽게 작성
		 2.  자동 줄바꿈 처리
		 3. 따옴표 escape 필요없음
		 4. html / json / sql 작성 매우 편리
		 */
		
		// 텍스트 블록 방식
		String textBlock = """
				이름:"홍길동"
				나이:20세
				키:189.9cm
				직업: 	'프로그래머'
				""";
		System.out.println(textBlock);
		
		// sql 작성 예시
		String sql = """
				SELECT *
				FROM users
				WHERE age > 20
				ORDER BY name
				""";
		System.out.println(sql);
		
		// formatted()
		// 문자열 포맷 가능
		String name = "홍길동";
		int age = 30;
		String message = """
				이름:%s
				나이:%d
				""".formatted(name,age);
		System.out.println(message);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요:");
		String myName = sc.nextLine();
		System.out.print("나이를 입력하세요:");
		int myAge = sc.nextInt();
		String message2 = """
				이름:%s
				나이:%d
				""".formatted(myName,myAge);
		System.out.println(message2);
	
	}
}
