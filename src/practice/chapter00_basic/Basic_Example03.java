package practice.chapter00_basic;

import java.util.Scanner;

public class Basic_Example03 {
	
	public static void main(String[] args) {
		
		int x=100, y=200, x2;
		
		System.out.println("교환전");
		System.out.println("x="+x+"\ny="+y);
		
		x2=x;
		x=y;
		y=x2;

		System.out.println("교환후");
		System.out.println("x="+x+"\ny="+y);
		
	}
}
