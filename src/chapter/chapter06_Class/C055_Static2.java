package chapter.chapter06_Class;

/*
	[static 메서드]
	1. 객체 생성 없이 사용 가능
	2. 클래스 이름으로 호출 가능
	3. 같은 클래스 내부에서는 메서드 이름만으로 호출 가능
 */

import java.util.Arrays;

public class C055_Static2 {
	
	// 클래스(=정정) 메서드
	// 객체 생성 없이 클래스 이름으로 바로 사용 가능
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	// 인스턴스 메서드
	// 반드시 객체를 생성해야 사용 가능
	public int minus(int x, int y) {
		return x-y;
	}
	
	public static void main(String[] args) {
		// 1. 클래스 이름으로 호출(권장)
		int sum1 = C055_Static2.add(1,2);
		System.out.println("클래스로 호출한 add() : "+sum1);
		
		// 2. 같은 클래스 내부에서는 메서드 이름만으로 호출 가능
		int sum2 = add(3,4);
		System.out.println("메서드명으로 호출한 add() : " + sum2);
		
		// 3. 객체를 통해 호출(가능하지만 권장 X)
		C055_Static2 cal = new C055_Static2();
		int sum3 = cal.add(5,6);
		System.out.println("객체로 호출한 add() : "+sum3);
		
		// 인스턴스 메서드 : 객체 생성 후 사용해야함
//		C055_Static2.minus(10,3); // error
		int result = cal.minus(10,3);
		System.out.println("minus 결과 : "+result);
		
		// 4. 예시
		int max = Math.max(10,20);
		System.out.println("최대값 : " + max);
		int random = (int)(Math.random()*30+1);
		System.out.println("랜덤 : "+random);
		
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int ran = (int)((Math.random()*45)+1);
			arr[i] = ran;
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("로또 번호 추첨기");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("["+arr[i]+"]");
		}
		System.out.println();
		System.out.println("행운을 빕니다.");
	}
}
