package practice.chapter07_Array;

import java.util.Scanner;

public class Array_Example01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[5];
		for (int i = 0; i < student.length; i++) {
			System.out.print("학생"+(i+1)+" 점수 입력 : ");
			int a = sc.nextInt();
			student[i] = a;
		}
		int sum = 0;
		System.out.println("입력한 점수");
		for (int i : student) {
			System.out.print(i+" ");
			sum+=i;
		}
		int max = student[0];
		int min = student[0];
		for(int i:student){
			max=Math.max(max,i);
			min=Math.min(min,i);
		}
		System.out.println();
		System.out.println();
		System.out.println("총점 : " + sum);
		double avg = sum/student.length;
		System.out.printf("평균 : %.1f\n", avg);
//		int max = 0;
//		for (int i = 0; i < student.length; i++) {
//			if (student[i] > max) {
//				max=student[i];
//			}
//		}
		System.out.println("최고 점수 : "+max);
		System.out.println("최저 점수 : "+min);
	}
}
