package practice.chapter03_Condition;

import java.util.Scanner;

public class If_Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("숫자1: ");
		a= sc.nextInt();
		System.out.print("숫자2: ");
		b= sc.nextInt();
		System.out.print("숫자3: ");
		c= sc.nextInt();
		
		if(a>=b&&a>=c){
			System.out.println("최대값: "+a);
		}else if (b>=c){
			System.out.println("최대값: "+b);
		}else {
			System.out.println("최대값: "+c);
		}
		
		/*
		int max = a;
		if(max<b){
			max=b;
		}
		if(max<c){
			max=c;
		}
		System.out.println("최대값: "+max);
		 */
	}
}
