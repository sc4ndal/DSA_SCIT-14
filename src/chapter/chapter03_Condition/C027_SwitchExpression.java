package chapter.chapter03_Condition;

public class C027_SwitchExpression {
	public static void main(String[] args) {
		
		/*
		[switch expression]
		- java 14 이상 부터 사용가능
		- switch문이 "값을 반환" 할 수 있는 형태
		- " -> " 문법을 사용해 break 필요 없음
		- 여러 줄의 작업 후 값을 반환할 때는 yield 사용
		- default를 작성하는 것이 안전
		 */
		
		int ranking = 1;
		
		String medal = switch (ranking){
			case 1 -> {									// 여러줄 작업할 땐 { } 필요
				System.out.println("우승을 축하드립니다!");
				yield "금메달";							// 여러줄 작업 후 값 반환할 때 yield
			}
			case 2 -> "은메달";
			case 3 -> "동메달";
			case 4,5 -> "장려상";
			default -> "참가상";
		};
		System.out.println(medal+"을 수여합니다.");
		
		// 값을 반환하지 않는 switch
		switch (3){
			case 1 -> System.out.println("안녕1");
			case 2 -> System.out.println("안녕2");
			case 3 -> System.out.println("안녕3");
			default -> System.out.println("기타");
		}
	}
}
