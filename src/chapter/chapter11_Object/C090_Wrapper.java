package chapter.chapter11_Object;

/*
	Wrapper 클래스
	기본형 데이터를 객체 형태로 다루기 위한 클래스
	int 	>	Integer
	char	>	Character
	double	>	Double
	boolean	>	Boolean
 */
public class C090_Wrapper {
	public static void main(String[] args) {
		// 1. Boxing (기본형 -> Wrapper)
		int i = 10;
		Integer w = Integer.valueOf(i);
		System.out.println(w);
		
		// 2. Unboxing (Wrapper -> 기본형)
		int j = w;
		System.out.println(j);
	}
}
