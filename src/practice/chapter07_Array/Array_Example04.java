package practice.chapter07_Array;

import java.util.Scanner;

public class Array_Example04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int[] ranA = new int[10];
		
		System.out.print("변경 전 : ");
		for (int i = 0; i < ranA.length; i++) {
			ranA[i]=(int)(Math.random()*10);
		}
		for (int i : ranA) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("변경하고 싶은 위치 1을 입력하세요");
		a = sc.nextInt()-1;
		
		System.out.println("변경하고 싶은 위치 2을 입력하세요");
		b = sc.nextInt()-1;
		
		c = ranA[a];
		ranA[a]=ranA[b];
		ranA[b]=c;
		
		System.out.print("변경 후 : ");
		for (int i : ranA) {
			System.out.print(i+" ");
		}
	}
}
