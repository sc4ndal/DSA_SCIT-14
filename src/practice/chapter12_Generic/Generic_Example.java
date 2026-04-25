package practice.chapter12_Generic;

import java.util.Random;
import java.util.Scanner;

class Picker<T> {
	private T[] items;
	
	public void setItems(T[] items) {
		this.items = items;
	}
	
	T pick() {
		Random ran = new Random();
		int index = ran.nextInt(items.length);
		return items[index];
	}
	
}

public class Generic_Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 개수 입력 : ");
		int num = sc.nextInt();
		String[] menus = new String[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("상품 이름 입력 : ");
			menus[i] = sc.next();
		}
		
		Picker<String> picker = new Picker<>();
		picker.setItems(menus);
		
		System.out.println("===== 상품 뽑기 =====");
		String result = picker.pick();
		System.out.println("뽑힌 메뉴 : "+result);
		
		sc.close();
	}
}
