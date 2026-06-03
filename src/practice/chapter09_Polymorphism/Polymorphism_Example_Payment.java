package practice.chapter09_Polymorphism;

class Payment {
	void pay() {
		System.out.println("결제진행");
	}
}

class CardPayment extends Payment {
	@Override
	void pay() {
		System.out.println("카드결제");
	}
}

class CashPayment extends Payment {
	@Override
	void pay() {
		System.out.println("현금결제");
	}
}


public class Polymorphism_Example_Payment {
	public static void main(String[] args) {
		Payment p1 = new CardPayment();
		Payment p2 = new CashPayment();
		
		payDevice(p1);
		payDevice(p2);
	}
	
	public static void payDevice(Payment p) {
		p.pay();
	}
}
