package chapter.chapter12_Generic;

class OrderSystem<T, U> {
	// 1. 클래스 제네릭
	void processOrder(T produtName, U quantity) {
		System.out.println("주문 상품 : " + produtName);
		System.out.println("수량 : " + quantity);
	}
	
	// 2. 메서드 제네릭 (클래스와 독립적)
	<K, V> void printInfo(K key, V value) {
		System.out.println("정보 : " + key + " = " + value);
	}
}

public class C103_GenericMethod2 {
	public static void main(String[] args) {
		
		OrderSystem<String, Integer> order = new OrderSystem<>();
		order.processOrder("노트북", 2);
//		order.processOrder(100, "마우스"); // 타입 순서가 안 맞아서 오류
	
		// 추가 정보 출력 (메서드 제네릭)
		order.printInfo("할인율", 0.15);
		order.printInfo("재고여부", true);
		
		// 타입을 직접 지정해서 호출할 수도 있음
		order.<Double, Character>printInfo(3.5,'A');
	
	}
}
