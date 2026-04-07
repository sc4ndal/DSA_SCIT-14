package chapter.chapter04_Loop;

public class C029_For2 {
	public static void main(String[] args) {
		// 1-100까지 숫자 합 100을 넘는 순간 숫자 구하기
		int sum=0, i;
		for(i=1; i<=100; i++){
			sum+=i;
			if(sum>100){
				break;
			}
		}
		System.out.println("100을 넘은 시점 : "+i);
		System.out.println("100을 넘었을 때 값 : "+sum);
	}
}
