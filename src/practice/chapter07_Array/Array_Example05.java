package practice.chapter07_Array;

import java.util.Arrays;

public class Array_Example05 {
	public static void main(String[] args) {
		String[] menu = {"브레드윌크", "초코", "소세지", "치즈"};
		String[] reverseMenu = new String[menu.length];
		
		System.out.print("원래 배열: ");
		for (String i : menu) {
			System.out.print(i+" ");
		}
		int a=0;
		for (int i = menu.length; i > 0; i--) {
			reverseMenu[i-1] = menu[a];
			a++;
		}
		System.out.println();
		for (String i : reverseMenu) {
			System.out.print(i+" ");
		}
	}
}
