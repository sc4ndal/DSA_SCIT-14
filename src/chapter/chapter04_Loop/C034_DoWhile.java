package chapter.chapter04_Loop;

import java.util.Scanner;

public class C034_DoWhile {
	public static void main(String[] args) {
		
		// do-while
		// 입력하는 값들의 합 구하기
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
		
		do {
			System.out.print("숫자를 입력하세요(끝낼 때 0 입력) : ");
			num = sc.nextInt();
			sum = sum + num;
		} while (num != 0);
		System.out.println("총 합계 : " + sum);
		
//		int sum=0,i=1;
//		do {
//			sum = sum + i;
//			i++;
//		}while (i<=100);
//		System.out.println(sum);
	
	}
}
