package chapter.chapter07_Array;
/*
	[배열 복사 방법]
	- 배열 복사는 "새 배열을 만들어 값을 옮기는 것"
 */


import java.util.Arrays;

public class C067_ArrayCopy2 {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5};
		int length = 10;
		System.out.println("원본 배열");
		System.out.println("ar : " + Arrays.toString(ar));
		System.out.println();
		
		// 1. System.arraycopy()
		// System.arraycopy(복사할 배열, 복사할 첫위치, 대상 배열, 붙여넣을 첫위치, 복사할 요소갯수)
		System.out.println("===1. System.arraycopy()===");
		int[] ar1 = new int[length];
		System.arraycopy(ar, 0, ar1, 0, ar.length);
		System.out.println("ar1 : "+Arrays.toString(ar1));
		System.out.println();
		
		// 2. Arrays.copyOf()
		// Arrays.copyOf(원본배열, 원본 배열에서 복사해올 길이)
		System.out.println("===2. Arrays.copyOf() ===");
		int[] ar2 = Arrays.copyOf(ar, length);
		System.out.println("ar2 : "+Arrays.toString(ar2));
		System.out.println("ar1 : " + ar1);
		System.out.println("ar2 : " + ar2);
		System.out.println(ar == ar2);
		
		// 3. for문 복사
		System.out.println("===3. for문을 이용한 복사 ===");
		int[] ar3 = new int[length];
		for (int i = 0; i < ar.length; i++) {
			ar3[i] = ar[i];
		}
		System.out.println("ar3 : " + Arrays.toString(ar3));
		System.out.println();
		
		System.out.println("===값 변경후 확인");
		ar[0] = 100;
		System.out.println("ar	: "+Arrays.toString(ar));
		System.out.println("ar2	: "+Arrays.toString(ar1));
		System.out.println("ar3	: "+Arrays.toString(ar2));
		System.out.println("ar4	: "+Arrays.toString(ar3));
	}
}
