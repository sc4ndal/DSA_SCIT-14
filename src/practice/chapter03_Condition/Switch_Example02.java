package practice.chapter03_Condition;

import java.util.Scanner;

public class Switch_Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		String c;
		
		System.out.print("연산자(+,-,*,/): ");
		c = sc.next();
		System.out.print("정수1 입력: ");
		a = sc.nextInt();
		System.out.print("정수2 입력: ");
		b = sc.nextInt();
		
		switch (c) {
			case "+" -> System.out.println("결과: " + (a + b));
			case "-" -> System.out.println("결과: " + (a - b));
			case "*" -> System.out.println("결과: " + (a * b));
			case "/" -> {
				if(a>0&&b>0){
					System.out.println("결과: " + ((double) (a / b)));
				}else {
					System.out.println("0을/으로 나눌 수 없습니다.");
				}
			}
			default -> System.out.println("입력오류");
		}
		
	}
}
