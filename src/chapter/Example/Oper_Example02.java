package chapter.Example;

import java.util.Scanner;

public class Oper_Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int lan = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		System.out.println("국어: "+lan);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		
		String result = (lan<40&&eng<40&&math<40) && ((double)(lan+eng+math)/3)>=60?
						  "pass" : "false";
		System.out.println(result);
	}
}
