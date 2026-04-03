package chapter.chapter01_Data;

public class C013_Casting {
	
	public static void main(String[] args) {
		
		/*
		[강제 형 변환(Explicit Casting)]
		큰 타입 -> 작은 타입으로 변환할 때 개발자가 직접 형 변환 필요
		(주의) 데이터 손실 발생 가능
		
		(데이터 타입) 변수명 = (변환하려는 데이터타입) 변수명;
		 */
		
		double a = 3;
		int b = (int) a;
		System.out.println("a : "+a+"\nb : "+b);
		
		// int -> byte
		int i = 130;
		byte bNum = (byte) i;
		System.out.println("i : "+i+"\nb : "+bNum);
		
		// char 형 변환
		int code = 65;
		char ch = (char) code;
		System.out.println(code+" : "+ch);
		
		
		
		
		
	}
}
