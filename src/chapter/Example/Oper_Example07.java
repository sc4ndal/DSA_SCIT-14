package chapter.Example;

import java.util.Scanner;

public class Oper_Example07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("정수 입력: ");
        int a = sc.nextInt();
		
		String result = (a%2==0)? "짝수" : "홀수";
		System.out.println("결과: "+result);
	}
}
