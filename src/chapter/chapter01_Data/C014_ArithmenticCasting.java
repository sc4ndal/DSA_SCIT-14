package chapter.chapter01_Data;

public class C014_ArithmenticCasting {
	
	public static void main(String[] args) {
		
		/*
		[산술 형 변환(Arithmetic Casting)]
		연산하 때 자동으로 타입이 변환되는 현상
		
		규칙
		1. byte, short, char 는 연산 시 int로 변환
		2. 서로 다른 타입끼리 연산하면 더 큰 타입으로 변환
		 */
		
		// char + char
		char ch1 = 'a';
		char ch2 = 'b';
		int result = ch1+ch2;
		System.out.println(ch1+"+"+ch2+"="+result);
		
		// int + double -> double
		int a = 5;
		double b = 3.14;
		double sum = a+b;
		System.out.println(a+"+"+b+"="+sum);
		
		// 나눗셈
		int x = 7;
		int y = 2;
		double sum2 = (double) x/y;
		System.out.println(x+"/"+y+"="+sum2);
		
		int num = 100;
		int result2 = num++;
		System.out.println(num);
		System.out.println(result2);
		
		System.out.println(num);
		double num1 = (double) num / 7;
		System.out.printf("%.3f",num1);
	}
}
