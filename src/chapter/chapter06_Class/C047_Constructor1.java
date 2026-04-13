package chapter.chapter06_Class;

/*
	[생성자(constructor)]
	객체가 생성될 때 자동으로 호출되는 메서드의 일종
	
	규칙
	1. 생성자의 이름은 클래스 이름과 같다.
	2. 리턴 타입이 없다.(void도 사용 X)
	3. 객체 생성시 자동으로 호출
	4. 하나의 클래스에 여러 개의 생성자를 만들 수 있다.(오버로딩)
 */

class User {
	String name;
	int age;
	
	// 기본 생성자
	User() {
		System.out.println("기본 생성자 출동");
	}
	// 명시적 생성자
	User(String aName) {
		name = aName;
	}
	
	User(String aName, int aAge) {
		name = aName;
		age = aAge;
	}
	
	void userInfo() {
		System.out.println("이름 : "+name+", 나이 : "+age);
	}
}

public class C047_Constructor1 {
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User("홍길동");
		User user3 = new User("이순신", 30);
		System.out.println(user1.name);
		System.out.println(user2.name);
		System.out.println("이름은 "+user3.name+"이고, 나이는 "+user3.age+"세 입니다.");
		System.out.println();
		
		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
	}

}
