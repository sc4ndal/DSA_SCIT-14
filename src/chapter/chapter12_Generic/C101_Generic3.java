package chapter.chapter12_Generic;

class Fruit {
	@Override
	public String toString() {
		return "과일";
	}
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "사과";
	}
}

class Banana extends Fruit {
	@Override
	public String toString() {
		return "바나나";
	}
}

class Grape {
	@Override
	public String toString() {
		return "포도";
	}
}

class FruitBox<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}

class MixedFruitBox<T, U> {
	private T fruit1;
	private U fruit2;
	
	public void add(T fruit1, U fruit2) {
		this.fruit1 = fruit1;
		this.fruit2 = fruit2;
	}
	public void printItems() {
		System.out.println(fruit1+", "+fruit2);
	}
}
public class C101_Generic3 {
	public static void main(String[] args) {
		// 1. 제네릭에도 다형성이 적용됨
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		
		fruitBox.setItem(new Fruit());
		System.out.println(fruitBox.getItem());
		
		fruitBox.setItem(new Apple());
		System.out.println(fruitBox.getItem());
		
		fruitBox.setItem(new Banana());
		System.out.println(fruitBox.getItem());
		
		// Grape는 Fruit 를 상속받지 못 해서 에러
//		fruitBox.setItem(new Grape());
	
		// 2. 복수 제네릭
		MixedFruitBox<Apple,Banana> mix = new MixedFruitBox<>();
		mix.add(new Apple(), new Banana());
		mix.printItems();
	
	}
}
