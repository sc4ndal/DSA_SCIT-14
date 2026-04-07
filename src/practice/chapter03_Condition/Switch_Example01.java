package practice.chapter03_Condition;

import java.util.Scanner;

public class Switch_Example01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		String result = switch (year % 12){
			case 0 -> "원숭이";
			case 1 -> "닭";
			case 2 -> "개";
			case 3 -> "돼지";
			case 4 -> "쥐";
			case 5 -> "소";
			case 6 -> "호랑이";
			case 7 -> "토끼";
			case 8 -> "용";
			case 9 -> "뱀";
			case 10 -> "말";
			case 11 -> "양";
			default -> "잘못된 입력";
		};
		System.out.println(year+"년생은 "+result+"띠입니다.");
	}
}
