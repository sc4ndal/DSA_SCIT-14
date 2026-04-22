package chapter.chapter11_Object;

public class C088_HashCode {
	public static void main(String[] args) {
		
		Student st1 = new Student("홍길동", 20260001);
		Student st2 = new Student("홍길동", 20260001);
		Student st3 = st1;
		Student st4 = new Student("홍길동", 20260003);
		
		System.out.println("===주소 비교(==)===");
		System.out.println("st1 == st2 : "+(st1==st2));
		System.out.println("st1 == st3 : "+(st1==st3));
		System.out.println("st1 == st4 : "+(st1==st4));
		System.out.println();
		
		System.out.println("===equals 비교===");
		System.out.println("st1.equals(st2) : "+st1.equals(st2));
		System.out.println("st1.equals(st3) : "+st1.equals(st3));
		System.out.println("st1.equals(st4) : "+st1.equals(st4));
		System.out.println();
		
		System.out.println("===hashCode===");
		System.out.println("st1.hashCode() : "+st1.hashCode());
		System.out.println("st2.hashCode() : "+st2.hashCode());
		System.out.println("st3.hashCode() : "+st3.hashCode());
		System.out.println("st4.hashCode() : "+st4.hashCode());
		System.out.println();
		
	}
}
