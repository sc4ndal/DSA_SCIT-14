package chapter.chapter00_basic;

// 생성한 클래스
public class C002_PrintTest {
	
	// 클래스 = 변수 + 메서드
	
	// java 프로그램은 항상 main() 에서 시작
	public static void main(String[] args) {

		// 실행할 코드 작성
		System.out.println("프로그램 시작");
		
		int a=1;
		// 출력 단축키 sout
		System.out.println("a="+a);
		System.out.println("b");
		System.out.println(1234);
		
		// 문자(char)
		System.out.println('아');
		
		// 문자열(String)
		System.out.println("안녕");
		
		// 문자열 연결
		System.out.println("나이:"+20);
		System.out.println("이름:"+"홍길동");
		
		// 계산출력
		System.out.println(1+2);
		System.out.println("1+2="+(1+2));
		System.out.println("1+2="+1+2);
		int i=1;
		int I=2;
		System.out.println(""+i+I);
	}
}
