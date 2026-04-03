package chapter.Example;

import java.util.Scanner;

public class Data_Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int b = sc.nextInt();
		
		System.out.println();
		System.out.println("첫 번째 숫자 : " + a);
		System.out.println("두 번째 숫자 : " + b);
		System.out.println("나눗셈 결과 : "+((double)a/b));
		
	}
}
