package chapter.chapter06_Class;

class Student2 {
	// 클래스 변수 : 모든 객체가 공유
	public static int serialNum;
	
	// 인스턴스 변수 : 객체마다 따로 가짐
	private int studentId;
	private String studentName;
	
	// static 초기화 블록 : 클래스가 로딩될 때 처음 한 번만 실행
	static {
		serialNum = 1000;
		System.out.println("static 초기화 블록 실행");
	}
	
	// instance 초기화 블록 : 객체가 생성될 때 마다 생성자보다 먼저 호출
	{
		serialNum++;
		studentId = serialNum;
		System.out.println("인스턴스 초기화 블록 실행");
	}
	
	public Student2() {
		System.out.println("기본 생성자 호출");
	}
	
	public Student2(String studentName) {
		System.out.println("명시적 생성자 호출");
		this.studentName = studentName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}

public class C056_Static3 {
	public static void main(String[] args) {
		System.out.println("현재 serialNum : " + Student2.serialNum);
		System.out.println();
		
		Student2 st1 = new Student2();
		st1.setStudentName("홍길동");
		Student2 st2 = new Student2();
		st2.setStudentName("이순신");
		
		System.out.println();
		System.out.println(st1.getStudentName()+"의 학번 : "+st1.getStudentId());
		System.out.println(st2.getStudentName()+"의 학번 : "+st2.getStudentId());
		
		st2.setStudentName("손흥민");
		System.out.println("이름변경");
		System.out.println(st2.getStudentName()+"의 학번 : "+st2.getStudentId());
		System.out.println();
		System.out.println("현재 serialNum : "+Student2.serialNum);
		System.out.println();
		
		Student2 st3 = new Student2("박민경");
		System.out.println(st3.getStudentName()+"의 학번 : "+st3.getStudentId());
		System.out.println("현재 serialNum : "+Student2.serialNum);
		
	}
}
