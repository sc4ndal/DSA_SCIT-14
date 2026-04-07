package chapter.chapter04_Loop;

public class C028_For1 {
	public static void main(String[] args) {
	
		int[] a = {1,2,3,4,5};
		
		// for : 제어변수 i는 지역변수이므로 밖에서 사용불가
		for(int i=1; i<=5; i++){ // i -> 1,2,3,4,5
			System.out.println(i+"번 학생 성적 처리"+a[i-1]+"등급");
		}
		
//		System.out.println(i); //error
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1-100 합 = "+sum);
		
		int sum2 = 0;
		for (int i = 0; i <= 100; i = i + 2) { // 홀수 또는 짝수만 더하도록 2개씩 업 i -> 0,2,4,6 ... 100
			sum2 += i;
		}
		System.out.println("짝수들의 합1: "+sum2);
		
		int sum3 = 0;
		for(int i=0; i<=100; i++){
			if (i % 2 != 0) { // 나눠서 나머지가 0이 아니면 -> 홀수
				continue;	  // 스킵
			}
			sum3+=i;
		}
		System.out.println("짝수들의 합2: "+sum3);
	}
}
