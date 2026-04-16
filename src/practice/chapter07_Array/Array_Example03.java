package practice.chapter07_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		int[] Original = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println("Original : "+Arrays.toString(Original));
		
		System.out.println("변경하고 싶은 위치 1을 입력하세요");
		a = sc.nextInt()-1;
		
		System.out.println("변경하고 싶은 위치 2을 입력하세요");
		b = sc.nextInt()-1;
		
		c = Original[a];
		Original[a]=Original[b];
		Original[b]=c;
		System.out.println("New : "+Arrays.toString(Original));
		
	}
}
