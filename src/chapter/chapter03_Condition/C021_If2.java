package chapter.chapter03_Condition;

public class C021_If2 {
	public static void main(String[] args) {
		
		int age = 15;
		
		// 1. if block(중괄호 사용) - 영역
		if(age>=19){
			System.out.println("성인입니다.");
			System.out.println("술집 입장");
			
		}
		
		// 2. 중괄호가 없는 if
		// if 문 바로 다음 한 줄만 제어 가능
		if (age>=19)
			System.out.println("성인입니다.");
		System.out.println("술집 입장");
		
		
	}
}
