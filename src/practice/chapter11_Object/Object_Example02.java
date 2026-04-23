package practice.chapter11_Object;

class Product {
	String name;
	int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product[" + "name=" + name + ", price=" + price + ']';
	}
	
	@Override
	public boolean equals(Object obj) {
		// 자기 자신이면 true
		if (this == obj) {
			return true;
		}
		// 다운캐스팅 후 값 비교
		Product other = (Product) obj;
		return name==other.name && price==other.price;
	}
}

public class Object_Example02 {
	public static void main(String[] args) {
		
		// 생성
		Product p1 = new Product("노트북", 1500000);
		Product p2 = new Product("노트북", 1500000);
		Product p3 = new Product("마우스", 20000);
		
		// 비교
		printProduct(p1);
		printProduct(p2);
		printProduct(p3);
		
		// 출력
		compareProduct(p1, p2);
		System.out.println();
		compareProduct(p1, p3);
		System.out.println();
		compareProduct(p2, p3);
		System.out.println();
		
	}
	
	static public void printProduct(Product p) {
		System.out.println(p);
	}
	static public void compareProduct(Product p1, Product p2) {
		System.out.println(p1+", "+p2+"\n상품 비교");
		if (p1.equals(p2)) {
			System.out.println("두 상품은 같은 상품입니다.");
		} else {
			System.out.println("두 상품은 다른 상품입니다.");
		}
	}
}
