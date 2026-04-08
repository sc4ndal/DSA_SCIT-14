package chapter.Example;

import java.util.Scanner;

public class If_Example04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int a = sc.nextInt();
		
		if(a<=100){
			if (a <= 100 && a > 90) {
				System.out.println("수");
			} else if (a > 80) {
				System.out.println("우");
			} else if (a > 70) {
				System.out.println("미");
			} else if (a > 60) {
				System.out.println("양");
			} else {
				System.out.println("가");
			}
		} else {
			System.out.println("잘못 입력했습니다.");
			System.exit(0);
		}
	}
}
