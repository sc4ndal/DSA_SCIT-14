package chapter.chapter09_Polymorphism;

class Animal {
	void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}
class Tiger extends Animal {
	@Override
	void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}
class Eagle extends Animal {
	@Override
	void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class C078_Polymorphism1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.move();
		
		Human h = new Human();
		h.move();
		
		Tiger t = new Tiger();
		t.move();
		
		Eagle e = new Eagle();
		e.move();
		System.out.println();
		moveMethod(new Animal());
		moveMethod(new Human());
		moveMethod(new Tiger());
		moveMethod(new Eagle());
	}
	
	public static void moveMethod(Animal animal) {
		animal.move();
	}
}
