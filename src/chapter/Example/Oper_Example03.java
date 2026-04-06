package chapter.Example;

import java.util.Scanner;

public class Oper_Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~999 사이의 정수를 입력하세요");
		int a = sc.nextInt();
		int x,y,z;
		x=a/100;
		y=(a%100)/10;
		z=a%10;
		int result = x+y+z;
		System.out.println(a);
		System.out.println("각 자리수의 합: "+result);
	}
}
