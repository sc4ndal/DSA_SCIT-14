package chapter.chapter13_Collection;

import java.util.*;

/*
	[Collections 클래스]
	Collection 객체(List, Set ..)를 쉽게 조작할 수 있도록
	도와주는 유틸리티 클래스
	
	sort(list)		정렬
	reverse(list)	순서 뒤집기
	shuffle(list)	무작위 섞기
	max(list)		최대값
	min(list)		최소값
 */
public class C111_LinkedList2 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("장보고");
		list.add("김유신");
		list.add("강감찬");
		list.add("을지문덕");
		
		System.out.println("=== 기본 출력 ===");
		print(list);
		
		// 정렬
		Collections.sort(list);
		System.out.println("=== 오름차순 ===");
		print(list);
		System.out.println("=== 내림차순 ===");
		Collections.reverse(list);
		print(list);
		
		// 무작위 섞기 - 출력할 때 마다 순서 바뀜
		Collections.shuffle(list);
		System.out.println("=== 무작위 ===");
		print(list);
		
		// 문자열 비교
		// 사전적 순서를 기준으로 결정
		String max = Collections.max(list);
		String min = Collections.min(list);
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	static void print(List<String> list) {
		for (String s : list) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
