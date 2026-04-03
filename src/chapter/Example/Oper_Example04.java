package chapter.Example;

import java.util.Scanner;

public class Oper_Example04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor,eng,math;
		System.out.print("kor 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("eng 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("math 점수 입력 : ");
		math = sc.nextInt();
		
		System.out.println("kor점수: "+kor);
		System.out.println("eng점수: "+eng);
		System.out.println("math점수: "+math);
		System.out.println("총합: "+(kor+eng+math)+" 평균: "+((double)(kor+eng+math)/3));
	}
}
