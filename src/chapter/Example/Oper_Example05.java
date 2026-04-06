package chapter.Example;

import java.util.Scanner;

public class Oper_Example05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째숫자 : ");
		int a = sc.nextInt();
		System.out.print("두번째숫자 : ");
		int b = sc.nextInt();
		System.out.print("세번째숫자 : ");
		int c = sc.nextInt();
		
		int maxNum = a >= b && a >= c ?
					a : b >= a && b >= c ?
					b : c;
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		System.out.println("제일 큰 숫자 : "+maxNum);
	}
}
