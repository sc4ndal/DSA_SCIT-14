package practice.chapter06_Class;

public class BankAccount {
	static int total;
	private String owner;
	private int balance;
	
	{
		total++;
	}
	// 생성자
	public BankAccount(String owner){
		this.owner = owner;
		this.balance = 0;
	}
	// 입금
	public void deposit(int money) {
		balance += money;
		System.out.println(owner+"님 계좌에 "+money+"원이 입급되었습니다.");
		System.out.println("잔액 : "+balance+"원");
	}
	// 출금
	public void withdraw(int money) {
		if (balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		} else {
			balance -= money;
			System.out.println(money+"원이 출금되었습니다.");
			System.out.println("잔액 : "+balance+"원");
		}
	}
	// 정보 출력
	public void info() {
		System.out.println("[" + owner + "님의 계좌]");
		System.out.println("현재 잔액 : "+balance+"원");
	}
}
