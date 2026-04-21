
public class arrayEx {
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		System.out.println("========================");
		
		s2="aaa";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		int[][] aaa = {{1,2,3},{4,5,6,7,8,9},{9,8,7,6,5,4,3,2,1}};
		
		int count=0;
		for (int i=0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[i].length; j++) {
				System.out.print(aaa[i][j]+" ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println(count);
		
		
		
	}
}
