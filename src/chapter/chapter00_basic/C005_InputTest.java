package chapter.chapter00_basic;

import java.util.Scanner;

public class C005_InputTest {
	public static void main(String[] args) {
		
		// 입력 테스트
		Scanner scan = new Scanner(System.in);
		System.out.print("a 입력 : ");
		double a = scan.nextDouble();
		System.out.println("a="+a);
		
		System.out.print("b 입력 : ");
		double b = scan.nextDouble();
		System.out.println("b="+b);
		
		double sum = a+b;
		System.out.println("a+b="+sum);
		
		double average = (a+b)/2;
		System.out.println("평균값="+average);
		
		System.out.print("실수 입력 : ");
		double d = scan.nextDouble();
		System.out.println("d="+d);
		
		// 문자열 입력
		System.out.print("문자열 입력 : ");
		String name = scan.next();
		System.out.println(name);
		
	}
}
