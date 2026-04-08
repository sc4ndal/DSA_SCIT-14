package chapter.Example;

import java.util.Scanner;

public class If_Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1: ");
		int a = sc.nextInt();
		System.out.print("숫자2: ");
		int b = sc.nextInt();
		System.out.print("숫자3: ");
		int c = sc.nextInt();
		
		if (a > b) {
			System.out.println("최대값: "+a);
		} else if (b > c) {
			System.out.println("최대값: "+b);
		} else {
			System.out.println("최대값: "+c);
		}
	}
}
