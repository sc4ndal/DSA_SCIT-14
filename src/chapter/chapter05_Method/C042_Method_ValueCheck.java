package chapter.chapter05_Method;

public class C042_Method_ValueCheck {
	public static void main(String[] args) {
		
//		C043_MethodUsage.method();
		
		System.out.println("=== 기본형 전달 ===");
		int num = 2;
		getDouble(num);
		System.out.println("num = " + num);
		
		System.out.println("=== 배열 전달 ===");
		int[] arr = {2, 8, 6};
		getDouble(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
	// 기본형 전달
	static int getDouble(int value) {
		value *= 2;
		System.out.println("method value = " + value);
		return value;
	}
	
	// 객체 전달(배열) -> 주소값에 해당하는 값을 변경
	static void getDouble(int[] value) {
		value[0] *= 2;
	}
}
