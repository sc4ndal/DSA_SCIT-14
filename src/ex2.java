import chapter.chapter05_Method.C039_Method2;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 금액 입력(엔) : ");
		int money = sc.nextInt();
		ex.resultPlus(money);
		
		System.out.println();
		
		System.out.println("C039클래스_methodB 반환값 : "+C039_Method2.methodB());
	}
}
