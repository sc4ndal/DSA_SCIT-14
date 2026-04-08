package chapter.Example;

import java.util.Scanner;

public class If_Example07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주차 시간(분): ");
		int time = sc.nextInt();
		int price = 2000;
		if (time > 30) {
			time-=29;
			int pTime = (time/10);
			price = price+(pTime*500);
			System.out.println("주차요금: "+price);
		} else if (time >= 1440) {
			System.out.println("주차요금: 20000원");
		} else {
			System.out.println("주차요금: " + price);
		}
		
	}
}
