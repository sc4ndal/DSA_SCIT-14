package chapter.chapter01_Data;

public class C012_AutoCasting {
	
	public static void main(String[] args) {
		
		/*
		[자동 형 변환(Auto Casting)]
		작은 타입 -> 큰 타입으로 변환될 때 자동으로 형 변환 발생
		byte -> short -> int -> long -> float -> double
		 */
		
		// byte -> int
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println("byte : "+bNum);
		System.out.println("int : "+iNum);
		
		// int -> float
		float fNum = iNum;
		
		System.out.println("int : "+iNum);
		System.out.println("float : "+fNum);
		
		// char -> int
		char ch = 'A';
		int code = ch;
		System.out.println(ch+" : "+code);
		
		
	}
}
