package chapter.chapter13_Collection;

/*
	[Comparable]
	- 객체를비교해 정렬 기준을 정의하는 인터페이스
	- 클래스 내부에서 정렬 기준을 정의한다.
	- TreeSet, TreeMap 에서 정렬을 위해 사용
	
	메서드
		compareTo(T o)
		
	반환값 의미
		양수		: 현재 객체 > 비교 객체
		0		: 같은 객체
		음수		: 현재 객체 < 비교 객체
		
 */

import java.util.Set;
import java.util.TreeSet;

class Member implements Comparable<Member> {
	
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
	
	@Override
	public int compareTo(Member m) {
		// 1차 정렬 : 이름
		int result = this.name.compareTo(m.name);
//		int result = this.name.compareTo(m.name)*-1;	// 역순
		
		// 2차 정렬 :  이름이 같으면 나이로 정렬
		if (result == 0) {
			return this.age - m.age;
//			return (this.age - m.age)*-1;		// 역순
		}
		return result;
	}
}

public class C117_Comparable {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동", 20);
		Member m2 = new Member("강감찬", 36);
		Member m3 = new Member("김유신", 28);
		Member m4 = new Member("을지문덕", 30);
		Member m5 = new Member("이순신", 44);
		Member m6 = new Member("이순신", 22);
		
		
		Set<Member> set = new TreeSet<>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		set.add(m6);
		
		for (Member m : set) {
			System.out.println(m);
		}
		
	
	}
}
