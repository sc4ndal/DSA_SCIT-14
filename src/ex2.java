import chapter.chapter05_Method.C039_Method2;

import java.util.Scanner;

public class ex2 {
	
	
	public static void main(String[] args) {
//		int a = (int)((Math.random()*10)+1);
//		System.out.println(a);
//
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("환전할 금액 입력(엔) : ");
//		int money = sc.nextInt();
//		ex.resultPlus(money);
//
//		System.out.println();
//
//		System.out.println("C039클래스_methodB 반환값 : "+C039_Method2.methodB());
//		System.out.println("종료");
//		System.exit(0);
		
				Scanner sc = new Scanner(System.in);
				
				System.out.print("주차 시간(분): ");
				int time = sc.nextInt();
				int price = 2000;
				if (time > 30) {
					time-=30;
					int pTime = (time/10)+1;
					price = price+(pTime*500);
					System.out.println("주차요금: "+price);
				} else if (time >= 1440) {
					System.out.println("주차요금: 20000원");
				} else {
					System.out.println("주차요금: " + price);
				}
				
			
		
	}
	
	
}
