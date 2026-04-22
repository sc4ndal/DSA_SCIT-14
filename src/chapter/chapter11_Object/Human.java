package chapter.chapter11_Object;

import java.util.Objects;

// Cloneable 인터페이스는 마커 인터페이스로,
// 클래스가 복제될 수 있음을 명시적으로 나타냄.

public class Human implements Cloneable{
	int age;
	String name;
	
	// 추가
	int[] score = new int[] {1,2,3};
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age+"세의 "+name;
	}
	
	@Override
	protected Human clone()  {
		try {
		
		// 1. 기본적인 객체 복사(얕은 복사)
		Human other = (Human) super.clone();
		
		// 2. 참조형 필드(score 배열)를 별도로 복사(깊은 복사)
		other.score = this.score.clone();
		
		return other;
		
		}catch (CloneNotSupportedException e) {
			System.out.println("복제를 지원하지 않는 객체입니다.");
			return null;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		// 1. 자기 자신과 비교하면 항상 true
		if (this == obj) {
			return true;
		}
		// 2. 비교 대상이 Human이 아니면 false
		if (!(obj instanceof Human)) {
			return false;
		}
		// 3. 다운캐스팅 후 멤버값 비교
		Human other = (Human) obj;
		return age == other.age && Objects.equals(name,other.name);
		
		
	}
}
