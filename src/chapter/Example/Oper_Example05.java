package chapter.Example;

import java.util.Scanner;

public class Oper_Example05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maxNum = a > b && b > c ?
					a : b > a && b > c ?
					b : c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(maxNum);
	}
}
