package chapter.chapter03_Condition;

import java.util.Scanner;

public class C023_Switch1 {
	public static void main(String[] args) {
		
		// switch - case
		// 하나의 변수 값을 기준으로 여러 경우를 비교할 때 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("음료를 선택해 주세요");
		System.out.println("1.콜라 2.사이다 3.이온음료 4.물");
		int a = sc.nextInt();
		
		switch (a){
			case 1:
				System.out.println("콜라 선택");
				break; // switch 종료
			case 2:
				System.out.println("사이다 선택");
				break;
			case 3:
				System.out.println("이온음료 선택");
				break;
			case 4:
				System.out.println("물 선택");
				break;
			default:
				System.out.println("취소");
				break;
		}
		
		
	}
}
