package practice.chapter06_Class;

public class Class_Example {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		BankAccount ba1 = new BankAccount("홍길동");
		// 정보 출력
		ba1.info();
		System.out.println();
		// 입금
		ba1.deposit(10000);
		ba1.deposit(5000);
		System.out.println();
		// 출금
		ba1.withdraw(8000);
		ba1.withdraw(2000);
		System.out.println();
		// 정보 출력
		ba1.info();
		System.out.println();
		
		System.out.println("총 고객 수 : "+BankAccount.total+"명");
	}
}
