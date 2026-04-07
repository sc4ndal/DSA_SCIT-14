package chapter.chapter03_Condition;

public class C025_Switch3 {
	public static void main(String[] args) {
		
		// 1. switch문에서 String 사용
		String contry = "Korea";
		
		switch (contry){
			case "Korea":
				System.out.println("Seoul");
				break;
			case "China":
				System.out.println("Beijing");
				break;
			case "Japan":
				System.out.println("Tokyo");
				break;
			default:
				System.out.println("해당 국가 수도 없음");
				break;
		}
		
		// 2. String 비교
		// == : 참조(주소) 비교
		// .equals() : 값 비교
		
		String a = "안녕";
		String b = "안녕";
		
		System.out.println("a==b : "+(a==b)); // 주소값 비교
		
		String c = new String("안녕");
		System.out.println("a==c : "+(a==c)); // 주소값 비교
		System.out.println("a.equals(b) : "+a.equals(b)); // 데이터값 비교
		System.out.println("a.equals(c) : "+a.equals(c)); // 데이터값 비교
		
	}
}
