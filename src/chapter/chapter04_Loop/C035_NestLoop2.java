package chapter.chapter04_Loop;

import java.util.Scanner;

public class C035_NestLoop2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			int num = (int)(Math.random()*100)+1; // 1~100까지
			while (true) {
				System.out.print("숫자를 입력하세요 : ");
				int answer = sc.nextInt();
				
				if (num == answer) {
					System.out.println("정답입니다.");
					break;
				} else if (num > answer) {
					System.out.println("보다 큽습니다.");
				} else {
					System.out.println("보다 작습니다.");
				}
			}
			System.out.println("다시 하시겠습니까? (y/n) : ");
			String a = sc.next();
			if (!a.equals("y"))
				break;
		}
	}
}
