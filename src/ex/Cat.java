package ex;

public class Cat implements Animal {
	
	@Override
	public void speak() {
		System.out.println("야옹");
	}
	
	@Override
	public void eat() {
		System.out.println("쩝쩝");
	}
}
