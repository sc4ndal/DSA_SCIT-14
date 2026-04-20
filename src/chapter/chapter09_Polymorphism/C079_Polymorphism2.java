package chapter.chapter09_Polymorphism;

import java.util.Arrays;

class Rabbit extends Animal {
	@Override
	void move() {
		System.out.println("껑충");
	}
}

class Cat extends Animal {
	@Override
	void move() {
		System.out.println("사뿐");
	}
}

public class C079_Polymorphism2 {
	public static void main(String[] args) {
		Animal rabbit = new Rabbit();
		Animal cat = new Cat();
		
		rabbit.move();
		cat.move();
		System.out.println("==================");
		Animal[] animals = {new Rabbit(), new Cat(), new Rabbit()};
		
		for (Animal a : animals) {
			a.move();
		}
	}
}
