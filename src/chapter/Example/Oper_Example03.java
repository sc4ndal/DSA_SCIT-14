package chapter.Example;

import java.util.Scanner;

public class Oper_Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~999 사이의 정수를 입력하세요");
		int a = sc.nextInt();
		int x,y,z;
		x=a/100;
		y=(a-x*100)/10;
		z=a-(x*100+y*10);
		int result = x+y+z;
		System.out.println(a);
//		System.out.printf("%d\n",x);
//		System.out.printf("%d\n",y);
//		System.out.printf("%d\n",z);
		System.out.println("각 자리수의 합: "+result);
	}
}
