package chapter.Example;

import java.util.Scanner;

public class If_Example05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도: ");
		int year = sc.nextInt();
		if (year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else if (year % 100 == 0) {
			System.out.println(year + "년은 평년입니다.");
		} else if (year % 4 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year+"년은 평년입니다.");
		}
	}
}
