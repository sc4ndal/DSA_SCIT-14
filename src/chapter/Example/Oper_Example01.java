package chapter.Example;

import java.util.Scanner;

public class Oper_Example01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("받은 금액 입력 : ");
		int price = sc.nextInt();
		System.out.print("상품 가격 입력 : ");
		int money = sc.nextInt();
		
		System.out.println("거스름돈 : "+(price-money));
	}
}
