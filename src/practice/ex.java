package practice;

import java.util.Scanner;

public class ex {
	public static void main(String[] args) {

//		int i, sum = 0;
//
//		for (i = 0; i<=10; i++){
//			if (i % 2 == 1) {
//
//				continue;
//			}
//			sum += i;
//		}
//		System.out.println(sum);
		
		int[] arr = {91, 49, 87, 56, 66, 77};
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > 90) {
				System.out.println((i + 1) + "번째 학생 성적 A등급");
			} else if (arr[i] > 80) {
				System.out.println((i + 1) + "번째 학생 성적 B등급");
			} else if (arr[i] > 70) {
				System.out.println((i + 1) + "번째 학생 성적 C등급");
			} else if (arr[i]>60){
				System.out.println((i + 1) + "번째 학생 성적 D등급");
			} else {
				System.out.println((i + 1) + "번째 학생 성적 F등급");
			}
			
		}
	}
}
