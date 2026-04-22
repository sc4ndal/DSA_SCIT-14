package chapter.chapter11_Object;

public class C093_StringBuilder1 {
	
	public static void main(String[] args) {
		/*
		 * [String vs StringBuilder vs StringBuffer]
		 *
		 * 1. String
		 *    - 불변(Immutable)
		 *    - 문자열을 변경하면 새로운 객체가 생성된다.
		 *
		 * 2. StringBuilder (Java 5+)
		 *    - 가변(Mutable)
		 *    - 문자열을 같은 객체 안에서 수정할 수 있다.
		 *    - 동기화 지원 X → 단일 스레드 환경에 적합
		 *
		 * 3. StringBuffer (Java 1.0+)
		 *    - 가변(Mutable)
		 *    - 문자열을 같은 객체 안에서 수정할 수 있다.
		 *    - 동기화 지원 O → 멀티 스레드 환경에 적합
		 *
		 * ※ 일반적으로 속도는 StringBuilder가 StringBuffer보다 빠르다.
		 */
		
		String        str = "Java";
		StringBuilder sb  = new StringBuilder("Java");
		StringBuffer  sf  = new StringBuffer("Java");
		
		System.out.println("=== 초기값 ===");
		System.out.println("String        : " + str);
		System.out.println("StringBuilder : " + sb);
		System.out.println("StringBuffer  : " + sf);
		
		System.out.println("\n=== 수정 전 hashCode ===");
		System.out.println("str : " + str.hashCode());
		System.out.println("sb  : " + sb.hashCode());
		System.out.println("sf  : " + sf.hashCode());
		
		// 문자열 수정
		str += " Programming";
		sb.append(" Programming");
		sf.append(" Programming");
		
		System.out.println("\n=== 수정 후 값 ===");
		System.out.println("String        : " + str);
		System.out.println("StringBuilder : " + sb);
		System.out.println("StringBuffer  : " + sf);
		
		System.out.println("\n=== 수정 후 hashCode ===");
		System.out.println("str : " + str.hashCode());
		System.out.println("sb  : " + sb.hashCode());
		System.out.println("sf  : " + sf.hashCode());
		
		/*
		 * String은 수정 전후 hashCode가 바뀔 수 있다.
		 * (새 문자열 객체가 만들어졌기 때문)
		 *
		 * StringBuilder, StringBuffer는 같은 객체 안의 내용만 바뀌므로
		 * 객체 자체는 유지된다.
		 */
	}
}