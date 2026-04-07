package chapter.chapter03_Condition;

import java.util.Scanner;

public class C024_Switch2 {
	public static void main(String[] args) {
		
		// 1. case 병합 처리
//		Scanner sc = new Scanner(System.in);
//		System.out.print("등수 입력 : ");
//		int ranking = sc.nextInt();
		int ranking = 3;
		
		switch (ranking){
			case 1:
				System.out.println("대상입니다.");
				break;
			case 2: case 3:
				System.out.println("우수상입니다.");
				break;
			case 4: case 5:
				System.out.println("장려상입니다");
				break;
			default:
				System.out.println("수상 대상이 아닙니다.");
		}
		
		// 2. 활용
		int month = 4;
		int days;
		
		switch (month){
			case 2: days = 28;					// 2월
			break;
			case 4: case 6: case 9: case 11:	// 30일까지 있는 달
				days = 30;
				break;
			default:
				days = 31;						// 나머지 달
				break;
		}
		System.out.println(month+"월은 "+days+"일까지 있음");
	}
}
