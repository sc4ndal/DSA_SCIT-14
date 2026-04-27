
public class ex {
	

	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
				System.out.printf(" ".repeat(5-i));
				System.out.print("*");
				if(i==4){
					System.out.printf("*".repeat(i*2));
				}
				else if (i != 0) {
					System.out.printf(" ".repeat((i*2)-1));
					System.out.print("*");
				}
				System.out.println();
			
		}
		
	
	}
}
