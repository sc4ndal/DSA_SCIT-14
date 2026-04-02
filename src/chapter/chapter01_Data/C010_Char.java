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
		
		/*
		[탈출 문자(Escape Sequence)]
		-문자열 안에서 특수 기능을 수행하는 문자
		\n : 줄바꿈
		\t : 탭
		\\ : \ 출력
		\' : ' 출력
		\" : " 출력
		 */
		
		System.out.println("안\n녕\t하\\세\'요\"");
		System.out.println("\"안녕\"하세요");
		
		/*
	[문자열(String)]
	-문자들의 집합(char 여러개 모인것)
	-String은 참조형 데이터 타입 -> 힙에 저장
	 */
		
		String str = "대한민국";
		System.out.println(str);
		
		//탈출 문자를 사용한 문자열
		String str2 = "아름다운 이 땅에 금수강산에 "
					+"단군 할아버지가 \"터\" 잡으시고\n"
					+"\'홍익인간\' 뜻으로 나라 세우니 "
					+"대대손손 휼륭한 인물도 많아.";
		System.out.println(str2);
	}
	
}
