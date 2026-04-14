package chapter.chapter06_Class;

/*
	[static 변수]
	1. static 변수
	- 모든 객체가 공유
	- 객체 없이 클래스 이름으로 사용가능
	2. instance 변수
	- 객체마다 따로 생성됨
	- 객체를 생성해야 사용 가능
 */

class School {
	// static 변수 (학교 이름은 하나만 존재)
	static String schoolName = "부산고등학교";
	static int total;
	//instance 변수(학생마다 이름이 다름)
	String studentName;
	
	{
		total++;
	}
	// 생성자
	School(String studentName) {
		this.studentName = studentName;
	}
	
	// instance 메서드
	void printInfo() {
//		System.out.println("학교 이름 : "+schoolName);
		System.out.println("학생 이름 : "+studentName);
	}
	
}

public class C054_Static1 {
	public static void main(String[] args) {
		System.out.println("[학교 이름 : "+School.schoolName+"]");
		School sc1 = new School("홍길동");
		School sc2 = new School("길동홍");
		School sc3 = new School("홍박사");
		sc1.printInfo();
		sc2.printInfo();
		sc3.printInfo();
		System.out.println("학생 수 : " + School.total+"명");
		System.out.println("====================");
		
		// static 변수는 모두가 공유
		System.out.println("sc1 학교명 : "+sc1.schoolName);
		// 권장 방식
		System.out.println("클래스명으로 접근 : "+School.schoolName);
	}
}
