package ex;

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
hashmap 데이터 비교
/*
boolean exists = false;

for (Reservate r : reservateMap.values()) {
    if (r.getName().equals(name)
            && r.getDate().equals(date)
            && r.getTime() == time) {
        exists = true;
        break;
    }
}

if (exists) {
    System.out.println("이미 존재하는 예약입니다.");
}
*/
}
