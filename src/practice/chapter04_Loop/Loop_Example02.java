package practice.chapter04_Loop;

import java.util.Scanner;

public class Loop_Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
//		for (int i = 0; i < 5; i++) {
//			System.out.print("정수 입력: ");
//			int x = sc.nextInt();
//			sum+=x;
//		}
//		System.out.println(sum);
		
		sum=0;
		int i = 0;
//		do {
//			System.out.print("정수 입력:");
//			int x = sc.nextInt();
//			sum+=x;
//			i++;
//		}while (i<5);
//		System.out.println(sum);
		
		while (i < 5) {
			System.out.print("정수 입력 : ");
			int x = sc.nextInt();
			sum+=x;
			i++;
		}
		System.out.println(sum);
	}
	
}
