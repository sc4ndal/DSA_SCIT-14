package chapter.chapter06_Class;

class Score {
	private int point; // 멤버, 인스턴스 변수
	
	Score(int point) { // 명시적 생성자
		setPoint(point);
	}
	
	public int getPoint() {
		return point;
	}
	
	 public void setPoint(int point) {
		 if (0 <= point && point <= 100) {
			 this.point = point;
		 } else {
			 System.out.println("변경실패! 0이상 100이하로 입력");
		 }
	 }
	 
	 void showInfo() {
		 System.out.println("점수 : "+point);
	 }
}

public class C052_Accessor2 {
	public static void main(String[] args) {
		
		Score s = new Score(90);
		s.showInfo();
		
		System.out.println("===변경 시도===");
		s.setPoint(150); // 100이상이라 잘못된 값
		s.showInfo();
		
		System.out.println("===변경 후===");
		s.setPoint(75);
		s.showInfo();
		
		System.out.println("현재 점수 : "+s.getPoint());
	}

}
