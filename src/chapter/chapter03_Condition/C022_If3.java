package chapter.chapter03_Condition;

public class C022_If3 {
	public static void main(String[] args) {
		
		int age = 19;
		boolean man = true;
		// if 중첩
		// if문 안에 또 다른 if 문
		if (age >= 19) {
			if(man){
				System.out.println("성인 남성 : 25000원");
			}else{
				System.out.println("성인 여성 : 21000원");
			}
		}else if(age>5){
			System.out.println("청소년 : 15000원");
		}else {
			System.out.println("무료");
		}
	}
}
