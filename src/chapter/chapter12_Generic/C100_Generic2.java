package chapter.chapter12_Generic;

class Box<T> {
	private T item;
	
	public Box(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
	
	public int add(T i) {
		int it = (int) i;
		return it += 2;
	}
}

class Coke {
	@Override
	public String toString() {
		return "콜라";
	}
}

public class C100_Generic2 {
	public static void main(String[] args) {
		
		// String
		Box<String> stringBox = new Box<>("안녕하세요");
		
		System.out.println(stringBox.getItem());
		
		String str = stringBox.getItem();
		System.out.println(str);
		
		
		// Int
		Box<Integer> integerBox = new Box<>(777);
		int num = integerBox.getItem();
		System.out.println(num);
		
		int i = integerBox.add(3);
		System.out.println(i);
		
		// Coke 전용 박스
		Box<Coke> box3 = new Box<>(new Coke());
		Coke coke = box3.getItem();
		System.out.println(coke);
		
		// 타입 안정성 확인
//		box1 = new Box<>(100);		// box1은 String 박스라서 에러
//		String s = box2.getItem();		// box2는 Integer 박스라서 에러
	
	}
}
