package chapter.chapter04_Loop;

public class C032_While1 {
	public static void main(String[] args) {
		
		// while
		int fileSize = 720;
		int download = 0;
		
		while (download < fileSize) {
			download += 120;
			System.out.println(download + "K 다운로드 중...");
		}
		System.out.println("다운로드 완료");
	}
}
