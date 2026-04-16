package practice.chapter05_Method;

import java.util.Scanner;

class BankAcount{
    static int balance = 0;

//    BankAcount() {
//        this.balance=0;
//    }
    void deposit(int money){
        balance += money;
        System.out.println("입금 완료");
    }
    void withDraw(int money) {
        if (balance < money) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance-=money;
            System.out.println("출금 완료");
        }
    }

    void info() {
        System.out.println("현재 잔액 : "+balance);
    }

    void pExit() {
        System.out.println("프로그램 종료");
        System.exit(0);
    }

}

public class Method_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAcount acc = new BankAcount();

        while (true) { // 무한루프 시작
            System.out.print("""
                    ==== ATM ====
                    1. 입금
                    2. 출금
                    3. 잔액조회
                    4. 종료
                    """);
            System.out.print("선택 : ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.print("입금 금액 : ");
                    int pMoney = sc.nextInt();
                    acc.deposit(pMoney);
                    break;
                case 2:
                    System.out.print("출금 금액 : ");
                    int mMoney = sc.nextInt();
                    acc.withDraw(mMoney);
                    break;
                case 3:
                    acc.info();
                    break;
                case 4:
                    acc.pExit();
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }

    }
}
