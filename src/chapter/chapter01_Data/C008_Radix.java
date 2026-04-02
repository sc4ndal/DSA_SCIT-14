package chapter.chapter01_Data;

public class C008_Radix {
	
	public static void main(String[] args) {
	
	/*
		[기수/진수]
		일반적으로 사용하는 10진수
		컴퓨터는 2진수
		8, 16진수는 RGB 색상코드
		
		10진수 : 그냥 숫자
		8진수 : 숫자 앞에 0
		16진수 : OX
		2진수 : 0B
	 */
		int a=10;
		int b=015;
		int c=0x10;
		int d=0b1001;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
