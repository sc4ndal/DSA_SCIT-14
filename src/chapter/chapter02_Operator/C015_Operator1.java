package chapter.chapter02_Operator;

import java.util.Scanner;

public class C015_Operator1 {
	
	public static void main(String[] args) {
		
		/*
		[산술 연산자]
		+ , - , * , / , %
		 */
		int a = 6, b = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두 개 입력");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("===산술연산자===");
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.printf(a + "/" + b + "=" + "%.3f",((double)a / b));
		System.out.println();
		System.out.println(a + "%" + b + "=" + (a % b));
		
		// 짝수/홀수
		if(a%2==1){
			System.out.println("첫번째 수는 홀수");
		}else{
			System.out.println("첫번째 수는 짝수");
		}
		
		// 대입 연산자
		int x,y,z,sum;
		x=3;
		y=4;
		z=5;
		sum=x+y+z;
		System.out.println(sum);
	}
}
