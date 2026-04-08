package chapter.Example;

import java.util.Scanner;

public class Switch_Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자(+,-,*,/)");
		String c = sc.next();
		System.out.print("정수1 입력: ");
		int a = sc.nextInt();
		System.out.print("정수2 입력: ");
		int b = sc.nextInt();
		double sum=0;
		if (a != 0 && b != 0) {
			switch (c) {
				case "+":
					sum = a + b;
					break;
				case "-":
					sum = a - b;
					break;
				case "*":
					sum = a * b;
					break;
				case "/":
					sum = (double) a / b;
					break;
			}
			;
		} else {
			System.out.println("0으로 나눌 수 없습니다.+");
		}
		
		System.out.println("결과: " + sum);
	}
}
