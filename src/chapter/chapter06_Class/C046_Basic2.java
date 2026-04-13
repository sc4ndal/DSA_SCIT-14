package chapter.chapter06_Class;

class Human {
	String name;
	int age;
	
	void intro() {
		System.out.println("안녕 나는 "+name+"이고, "+age+"살이야");
	}
	void run() {
		System.out.println(name+"이(가) 도망갔습니다.");
	}
	void birthday() {
		age++;
		System.out.println(name + "의 나이가 1살 증가했습니다.\n"
				+ name + "의 현재 나이 : " + age + "살 입니다.");
	}
}

public class C046_Basic2 {
	public static void main(String[] args) {
		Human man1 = new Human();
		man1.name = "홍길동";
		man1.age = 20;
		man1.intro();
		man1.birthday();
		man1.run();
	}
	
	
	
}
