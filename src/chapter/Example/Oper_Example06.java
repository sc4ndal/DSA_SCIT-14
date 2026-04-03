package chapter.Example;

import java.util.Scanner;

public class Oper_Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m,s,sec;
		
		System.out.println("초를 입력하세요: ");
		sec = sc.nextInt();
		h = (sec / 3600);
//		System.out.println(h);
		m = (sec / 60)-(h*60);
//		System.out.println(m);
		s=sec%60;
//		System.out.println(s);
		System.out.println("초를 입력하세요: ");
		System.out.println(h+"시간 "+m+"분 "+s+"초");
		
		
	}
}
