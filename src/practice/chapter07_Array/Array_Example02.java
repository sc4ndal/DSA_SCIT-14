package practice.chapter07_Array;

import java.util.Scanner;

public class Array_Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[5];
		int length = student.length;
		int[] rank = new int[length];
		for (int i = 0; i < student.length; i++) {
			System.out.print("학생"+(i+1)+" 점수 입력 : ");
			int a = sc.nextInt();
			student[i] = a;
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (student[j] > student[i]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.println("학생"+i+" 점수 : "+student[i]+" / 등수 : "+(rank[i]+1));
		}
		System.out.println();
	}
}
