class Box<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	
}

public class ex {
	
	public static void main(String[] args) {
		
		Box<String> stringBox = new Box<>();
		
		stringBox.setItem("hello");
		
		String a = stringBox.getItem();
		System.out.println(a);
		
		String[] strBox = {"a","b","c"};
		Integer[] intBox = {1,2,3};
		
		printArray(strBox);
		System.out.println();
		printArray(intBox);
	
	}
	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.print(element+" ");
		}
	}
}
