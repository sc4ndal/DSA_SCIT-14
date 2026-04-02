package chapter.chapter01_Data;

public class C010_Char {
	
	public static void main(String[] args) {
		
		/*
		[문자형]
		char
		-문자 1개 저장
		-2byte(16bit)
		-내부적으로는 유니코드 숫자를 저장
		 */
		
		char ch = '한';
		char ch2 = '\uD55C'; //유니코드 표현
		System.out.println(ch);
		System.out.println(ch2);
		
		// char -> int
		int i = ch+1;
		System.out.println(i);
		
		char ch3 = (char) i;
		System.out.println(ch3);
		
		// char 연산
		char c = 'A';
		System.out.println(c);
		
		c = (char) (c+1);
		System.out.println(c);
		
	}
}
