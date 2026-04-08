package chapter.Example;

import java.util.Scanner;

public class If_Example01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력: ");
		int a = sc.nextInt();
		System.out.print("세로 입력: ");
		int b = sc.nextInt();
		
		int result = a*b;
		System.out.println("직사각형의 넓이는 "+result+"입니다.");
	}
}
