package chapter.chapter11_Object;

/*
	[clone()]
	객체를 복제해 새로운 객체를 생성하는 메서드
	Object 클래스로부터 재정의해 사용함.
	Cloneable 인터페이스를 구현하지 않으면 super.clone() 호출시 예회 발생
 */
public class C089_Clone {
	public static void main(String[] args) {
		
		Human kim = new Human(29, "김상형");
		Human kim2 = kim.clone();
		
		System.out.println("===객체 자체 비교===");
		System.out.println("kim==kim2" + (kim == kim2));
		System.out.println("kim.hashCode()" + kim.hashCode());
		System.out.println("kim2.hashCode()" + kim2.hashCode());
		System.out.println();
		
		System.out.println("===복제 후===");
		System.out.println("kim : " + kim);
		System.out.println("kim2 : " + kim2);
		System.out.println();
		
		// 복제본의 일반 필드 변경
		kim2.name = "이순신";
		
		System.out.println("===이름 변경 후===");
		System.out.println("kim.name : " + kim.name);
		System.out.println("kim2.name : " + kim2.name);
		System.out.println();
		
		// 복제본의 배열 요소 변경
		kim2.score[0] = 999;
		
		System.out.println("===score 변경 후===");
		System.out.println("kim.score[0] : "+kim.score[0]);
		System.out.println("kim2.score[0] : "+kim2.score[0]);
		
		System.out.println("===배열 주소 비교===");
		System.out.println("kim.score==kim2.score : " + (kim.score == kim2.score));
		System.out.println("kim.score : "+kim.score);
		System.out.println("kim2.score : " + kim2.score);
		
		System.out.println("===최종 객체 출력===");
		System.out.println("kim : "+kim);
		System.out.println("kim2 : " +kim2);
	}
}
