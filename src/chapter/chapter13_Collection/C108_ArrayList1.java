package chapter.chapter13_Collection;

/*
	List interface
	특징
		1. 순서가 있는 데이터 집합
		2. 종복된 데이터 저장 가능
		3. index로 접근 가능
		
	ArrayList
		- 배열 기반의 List 구현 클래스
		- 데이터 조회 속도가 빠름
		- 중간 삽입/삭제는 상대적으로 느림
 */

import java.util.ArrayList;
import java.util.List;

public class C108_ArrayList1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// 데이터 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("현재 리스트 : "+list);
		
		// 특정 위치에 데티어 삽입
		list.add(2, 5);		// index 2 위치에 5 삽입
		System.out.println("index 2에 5 삽입 : "+list);
		
		// 데이터 수정
		list.set(1, 10);		// index 1 값을 10으로 변경
		System.out.println("index 1값을 10으로 변경 : "+list);
		
		// 데이터 삭제
		list.remove(0);		// index 0 값 제거
		System.out.println("index 0값 제거 : "+list);
		
		// 데이터 조회
		System.out.println("get(0) : " + list.get(0));
		
		// 리스트 크기
		System.out.println("size(): "+list.size());
		
		// 특정 값 포함 여부
		System.out.println("contains(10) : " + list.contains(10));
		
		System.out.println("================================");
		
		// 일반 for 문
		System.out.println("일반 for문");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		// 향상된 for 문
		System.out.println("향상된 for문");
		for (Integer i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 리스트 비우기
		list.clear();
		System.out.println("clear() 이후 size : "+list.size());
		System.out.println("isEmpty() : "+list.isEmpty());
		
		//
	}
}
