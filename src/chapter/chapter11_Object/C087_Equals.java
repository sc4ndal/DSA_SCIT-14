package chapter.chapter11_Object;

/*
	equals()
	Object 클래스의 equals()는 기본적으로 주소값(참조값)을 비교한다.
	하지만 클래스에서 equals()를 오버라이딩하면
	객체가 동일한지의 판단 기준을 정의할 수 있다.
	
 */
public class C087_Equals {
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		Human lee = new Human(43, "이승우");
		Human kim2 = new Human(29, "김상형");
		Human kimcopy = kim;
		
		System.out.println("===객체 정보 출려===");
		System.out.println("kim 		: "+kim);
		System.out.println("lee 		: "+lee);
		System.out.println("kimcopy 	: "+kimcopy);
		System.out.println("kim2 		: "+kim2);
		
		System.out.println("===비교(참조값 비교)===");
		System.out.println("kim==lee 		: "+(kim==lee));
		System.out.println("kim==kimcopy 	: "+(kim==kimcopy));
		System.out.println("kim==kim2 		: "+(kim==kim2));
		
		System.out.println("===equals 비교(객체 내용 비교)===");
		System.out.println("kim.equals(lee) 		: "+kim.equals(lee));
		System.out.println("kim.equals(kimcopy) 	: "+kim.equals(kimcopy));
		System.out.println("kim.equals(kim2) 		: "+kim.equals(kim2));
	}
}
