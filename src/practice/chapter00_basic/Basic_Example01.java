package practice.chapter00_basic;

import java.util.Scanner;

public class Basic_Example01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("정수를 입력하세요 : ");
		a = sc.nextInt();
		System.out.println("입력받은 값 : "+a);
		
		System.out.println("");
		
		double b = 0.0;
		System.out.print("실수를 입력하세요 : ");
		b = sc.nextDouble();
		System.out.println("입력받은 값 : "+b);
		
		System.out.println("");
		
		System.out.println("문자열을 입력하세요 : ");
		sc.nextLine();
		String text = sc.nextLine();
		System.out.println("입력받은 값 : "+text);
	
	}
}
