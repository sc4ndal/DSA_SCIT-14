package chapter.chapter13_Collection;

/*
	[Comparator]
	- 외부에서 객체의 정렬 기준을 정의하는 인터페이스
	- compare(T o1, T o2)
	
	Comparable : 클래스 내부 정렬 기준
	Comparator : 외부 정렬 기준
	
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 하나의 인터페이스에 하나의 메서드만 존재
@FunctionalInterface
interface MyPrinter {
	void print();
}


// 이름 기준 정렬을 정의한 객체
class PersonNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"("+age+")";
	}
	
}

public class C118_Comparator {
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 30));
		list.add(new Person("강감찬", 80));
		list.add(new Person("이순신", 45));
		
		System.out.println("=== 1. 일반 클래스 방식 ===");
		Collections.sort(list, new PersonNameComparator());
		printList(list);
		
		System.out.println("=== 2. 익명 클래스 방식 ===");
		// 익명 클래스 - 부모의 이름으로 인스턴스 생성
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		printList(list);
		
		System.out.println("=== 3. 람다식 방식 ===");
		Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));
		printList(list);
		
		System.out.println("=== 4. 심화 ===");
		// 1. 익명 클래스 방식
		MyPrinter p1 = new MyPrinter() {		// -> Heap 영역에 들어감
			@Override
			public void print() {
				System.out.println("안녕하세요.");
			}
		};
		p1.print();
		
		// 2. 람다식 방식
		MyPrinter p2 = () -> System.out.println("반갑습니다");
		p2.print();
	}
	
	static void printList(List<Person> list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}
}
