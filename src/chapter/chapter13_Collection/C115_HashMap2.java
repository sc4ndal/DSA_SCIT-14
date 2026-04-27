package chapter.chapter13_Collection;

import java.util.HashMap;

class Human {
	int age;
	String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 다운캐스팅 후 값 비교
		if (obj instanceof Human) {
			Human other = (Human) obj;
			return age == other.age && name.equals(other.name);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.length() + age;
	}
}

public class C115_HashMap2 {
	public static void main(String[] args) {
		HashMap<Human, Integer> donate = new HashMap<>();
		donate.put(new Human(42, "김기남"), 10000);
		donate.put(new Human(24, "박수빈"), 20000);
		donate.put(new Human(20, "박수현"), 5000);
		donate.put(new Human(11, "최상미"), 8000);
		
		/*
		 HashMap donate에 Human 값만 입력하고 Integer 값은 입력하지 않아 null이 출력될 수 있음.
		 park 객체의 주소가 달라 같은지 인식 못 하지만
		 equals 와 hashCode 메서드 재정의를 통해 동일 객체인지 비교시킴.
		 */
		
		Human park = new Human(20, "박수현");
		System.out.println(park.name +"씨의 기부금 = "+donate.get(park));
		
		
	}
}
