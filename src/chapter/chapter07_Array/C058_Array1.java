package chapter.chapter07_Array;

/*
	[배열]
	- 같은 타입의 데이터를 하나의 변수로 여러 개를 저장할 수 있는 구조
 */

public class C058_Array1 {
	public static void main(String[] args) {
		// 1. 배열 선언 + 생성
		int[] arr1; // 선언
		arr1 = new int[5]; // 생성
		
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr1[4] : "+arr1[4]);
		System.out.println();
		
		// 2. 배열 값 저장(초기화)
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		arr1[4]=5;
		System.out.println("배열 길이 : "+arr1.length);
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=i*10+10;
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		System.out.println();
		
		// 3. 배열 선언 + 초기화
		int[] arr2;
		arr2 = new int[]{1, 2, 3, 4, 5}; // 배열을 선언 후에는 new 데이터타입[] {값} 이 필요함
		int[] arr3 = {5, 4, 3, 2, 1};  // 간편
		System.out.println("arr2 출력");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr["+i+"] : " + arr2[i]);
		}
		System.out.println();
		System.out.println("arr3 출력");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		arr3[3]=100;
		System.out.println("값 변경 후");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
