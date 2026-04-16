package chapter.chapter07_Array;

import java.util.Arrays;

public class C066_ArrayCopy1 {
	public static void main(String[] args) {
		int i =123;
		int i2 = 123;
		System.out.println("===기본형 비교===");
		System.out.println("i와 i2 : "+((i==i2)? "같다":"다르다"));
		System.out.println();
		
		int[] ar = {1,2,3};
		int[] ar2 = {1,2,3};
		int[] ar3 = ar;
		System.out.println("===배열 참조 비교===");
		System.out.println("ar 과 ar2 : "+(ar==ar2 ?"같다":"다르다"));
		System.out.println("ar  : "+ar);
		System.out.println("ar2 : " + ar2);
		System.out.println();
		System.out.println("===같은 배열을 참조하는 경우");
		System.out.println("ar 과 ar3 : " + (ar == ar3 ? "같다" : "다르다"));
		System.out.println();
		
		/*
		Arrays 클래스
		- 배열을 다루기 위한 유틸리티 클래스
		- 주요 메서드
			- equals()		: 1차원 배열 요소 비교
			- deepEquals()	: 다차원 배열 요소 비교
			- toString()	: 배열 내용 출력
			- sort()		: 배열 정렬
			- copyOf()		: 배열 복사
		 */
		
		System.out.println("===배열 요소 비교===");
		System.out.println("ar과 ar2 요소가 같은지? :"+ Arrays.equals(ar,ar2));
		System.out.println();
		
		System.out.println("===배열 내용 출력===");
		System.out.println("ar	: "+Arrays.toString(ar));
		System.out.println("ar2	: "+Arrays.toString(ar2));
		System.out.println("ar3	: "+Arrays.toString(ar3));
		System.out.println();
	}
}
