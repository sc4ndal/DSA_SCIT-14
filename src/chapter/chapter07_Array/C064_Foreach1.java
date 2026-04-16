package chapter.chapter07_Array;

public class C064_Foreach1 {
	public static void main(String[] args) {
		/*
		[enhanced for문(foreach)]
		- 배열이나 컬렉션(list, set 등)을 간단하게
		순회할 때 사용하는 반복문
		
		기본 구조
		for(데이터타입 변수명 : 배열 or 컬렉션){
			반복할 코드
		}
		 */
		int[] arr = {1,2,3};
		int count=0;
		// 배열 순회
		for (int i : arr) {
			System.out.print(i+ " ");
			count++;
		}
		System.out.println();
		System.out.println(count);
		System.out.println("====================");
		
		int[] score = {88,94,51,57,35};
		int sum = 0;
		for (int i : score) {
			sum+=i;
		}
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+(double)sum/score.length);
		
		System.out.println("=====================");
		
		// foreach 특징
		int[] score2 = {88, 94, 51, 57, 35};
		for (int s : score2) {
			s++; // 값들을 증가 시켜도 원본을 수정하진 않음
			System.out.print(s+" ");
		}
		System.out.println();
		
		// 원본 확인
		System.out.println("score2[0] = "+score2[0]);
	}
}
