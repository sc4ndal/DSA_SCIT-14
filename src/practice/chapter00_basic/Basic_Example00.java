package practice.chapter00_basic;

import java.util.Scanner;

public class Basic_Example00 {
	
	public static void main(String[] args) {
	
		// 입력을 받기 위해 스캐너 필요
		Scanner sc = new Scanner(System.in);
		
		// next() vs nextLine()
		System.out.print("단어 입력(next): ");
//		System.out.println("단어 입력(next): "); //줄바꿈도 이루어짐
		String word = sc.next();
		
		// sc.next();는 공백에서 잘라버림
		// 개행문자(/n)이 남아서 nextLine()이 종료돼서 앞에 sc.nextLine()추가 입력 필요
		sc.nextLine();
		
		System.out.println("문장 입력(nextLine) : ");
		String sentence = sc.nextLine();
		
		System.out.println("word : " + word);
		System.out.println("sentence : " + sentence);
		
		// nextInt()
		System.out.println("=============");
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // /n 버퍼 제거
		
		System.out.print("주소 입력 : ");
		String address = sc.nextLine();
		
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+address);
		
	}
}
