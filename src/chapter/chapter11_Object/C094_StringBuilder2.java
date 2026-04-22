package chapter.chapter11_Object;

public class C094_StringBuilder2 {
	
	public static void main(String[] args) {
		
		long start1 = System.currentTimeMillis();
		String str = "";
		
		for (int i = 0; i < 10000; i++) {
			str += "a";
		}
		
		long end1 = System.currentTimeMillis();
		
		long start2 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 10000; i++) {
			sb.append("a");
		}
		
		long end2 = System.currentTimeMillis();
		
		System.out.println("String 사용 시간        : " + (end1 - start1) + "ms");
		System.out.println("StringBuilder 사용 시간 : " + (end2 - start2) + "ms");
	}
}