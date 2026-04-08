package chapter.Example;

import java.util.Scanner;

public class Switch_Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("""
				메뉴
				1. 콜라 (1500원)
				2. 사이다 (1400원)
				3. 커피 (1200원)
				4. 물 (800원)
				""");
		System.out.print("금액 입력: ");
		int money = sc.nextInt();
		System.out.print("메뉴 입력(1~4): ");
		int x = sc.nextInt();
		
			switch (x) {
				case 1 :
					if (money > 1500) {
						System.out.println("콜라가 나왔습니다.");
						System.out.println("거스름돈: " + (money - 1500) + "원");
						break;
					} else {
						System.out.println("돈이 부족합니다.");
						break;
					}
				case 2:
					if (money > 1400) {
						System.out.println("사이다가 나왔습니다.");
						System.out.println("거스름돈: " + (money - 1400) + "원");
						break;
					} else {
						System.out.println("돈이 부족합니다.");
						break;
					}
				case 3:
					if (money > 1200) {
						System.out.println("커피가 나왔습니다.");
						System.out.println("거스름돈: " + (money - 1200) + "원");
						break;
					} else {
						System.out.println("돈이 부족합니다.");
						break;
					}
				case 4:
					if (money > 800) {
						System.out.println("물이 나왔습니다.");
						System.out.println("거스름돈: " + (money - 800) + "원");
						break;
					} else {
						System.out.println("돈이 부족합니다.");
						break;
					}
				default:
					System.out.println("잘못된 선택 프로그램 종료");
					System.exit(0);
			}
	}
}
