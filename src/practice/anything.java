package practice;

import java.util.Scanner;

public class anything {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 입력 : ");
		int math = sc.nextInt();
		
		String result = kor<40||eng<40||math<40?"불합격":(double)(kor+eng+math)/3>=60? "합격":"불합격";
		System.out.println(result);
		
	}
}
