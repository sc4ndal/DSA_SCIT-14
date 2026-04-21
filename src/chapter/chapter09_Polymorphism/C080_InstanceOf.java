package chapter.chapter09_Polymorphism;

/*
	[instanceof 연산자]
	참조변수가 특정 타입의 인스턴스를 참조하고 있는지 확인하는 연산자
		참조변수 instanceof 클래스명
	결과값
		true : 해당 타입의 인스턴스이거나, 그 자식 타입의 인스턴스인 경우
		false : 해당 타입이 아닌 경우
 */

class Dog extends Animal {
	void bark() {
		System.out.println("멍멍");
	}
	void move() {
		System.out.println("개가 움직입니다.");
	}

}

class Dove extends Animal {
	void fly() {
		System.out.println("퍼득퍼득");
	}
	void move() {
		System.out.println("새가 날아갑니다.");
	}
	
}
public class C080_InstanceOf {
	public static void main(String[] args) {
		// 1. 자신의 타입으로 객체 생성
		Dog dog1 = new Dog();
		dog1.move();
		dog1.bark();
		System.out.println();
		
		// 2. 부모 타입으로 업캐스팅
		Animal dog2 = new Dog();
		dog2.move();
//		dog2.bark(); // 호출 불가 에러
		System.out.println();
		
		// 3. 다른 자식 객체도 부모 타입으로 참조 가능
		Animal dove = new Dove();
		dove.move();
//		dove.fly(); // 에러
		System.out.println();
		
		// 4. 순수 부모 객체
		Animal animal = new Animal();
		animal.move();
		System.out.println();
		
		testAnimal(dog1);
		testAnimal(dog2);
		testAnimal(dove);
		testAnimal(animal);
		
		System.out.println("=== instanceof 결과 확인 ===");
		System.out.println("dog1 instaceof Animal : "+(dog1 instanceof Animal));
		System.out.println("dog2 instaceof Animal : "+(dog2 instanceof Animal));
		System.out.println("dog2 instaceof Dog : "+(dog1 instanceof Dog));
		System.out.println("dove instaceof Animal : "+(dove instanceof Animal));
		System.out.println("dove instaceof Dove : "+(dove instanceof Dove));
		System.out.println("animal instaceof Dog : "+(animal instanceof Dog));
		System.out.println("animal instaceof Dove : "+(animal instanceof Dove));
		
//		System.out.println("출력");
//		Animal[] animals = {new Dog(), new Dove()};
//		for (Animal a : animals) {
//			a.move();
//		}
	}
	
	static void testAnimal(Animal animal) {
		System.out.println("[testAnimal 실행]");
		animal.move();
		
		//Dog 가 아닌 타입의 인스턴스를 넣으면 에러
//		Dog mydog = (Dog) animal;
//		mydog.bark();
		
		if (animal instanceof Dog) {
			Dog myDog = (Dog) animal;
			myDog.bark();
		}
		// 패턴 매칭
		else if (animal instanceof Dove myDove) {
//			Dove myDove = (Dove) animal;
			myDove.fly();
		} else {
			System.out.println("일반 Animal");
		}
	}
}
