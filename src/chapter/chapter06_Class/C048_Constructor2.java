package chapter.chapter06_Class;

/*
	this
	- 현재 객체가 자기 자신을 가리키는 키워드
	- 멤버변수와 파라미터의 이름이 같을 때 구분할 수 있음
	
	this()
	- 같은 클래스의 다른 생성자를 호출할 때 사용
	- 반드시 생성자의 첫 줄에 작성
 */

class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	Time() {
		System.out.println("기본 생성자 실행");
	}
	
	Time(boolean am, int hour, int minute) {
//		this.am = am;
//		this.hour = hour;
//		this.minute = minute;
		this(am,hour,minute,0);
		System.out.println("명시적 생성자 실행1");
	}
	
	Time(boolean am, int hour, int minute, int second) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		System.out.println("명시적 생성자 실행2");
	}
	
	void whatTime() {
		System.out.print(am ? "오전 " : "오후 ");		// -> boolean 초기값 = false
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}

public class C048_Constructor2 {
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.whatTime();
		System.out.println();
		
		Time t2 = new Time(true, 10, 30);
		t2.whatTime();
		System.out.println();
		
		Time t3 = new Time(false, 3, 15, 20);
		t3.whatTime();
		System.out.println();
		
		
	}
}
