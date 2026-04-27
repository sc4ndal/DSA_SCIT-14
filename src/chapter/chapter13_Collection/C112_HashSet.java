package chapter.chapter13_Collection;

import java.util.*;

/*
	[Set]
	특징
		1. 중복 데이터 저장 불가
		2. 저장 순서 보장 안 함
		3. 빠른 검색 가능
 */
public class C112_HashSet {
	public static void main(String[] args) {
		
		Set<String> kangwon = new HashSet<>();
		
		kangwon.add("춘천시");
		kangwon.add("철원군");
		kangwon.add("정선군");
		kangwon.add("강릉시");
		kangwon.add("화천군");
		kangwon.add("춘천시");	// 중복 데이터
		
		System.out.println("저장된 데이터 개수 : " + kangwon.size());
		System.out.println();
		
		// 1. Iterator 출력
		System.out.println("=== Iterator 출력 ===");
		Iterator<String> it = kangwon.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 2. foreach 문 출력
		System.out.println("=== foreach 출력 ===");
		for (String s : kangwon) {
			System.out.println(s);
		}
		
		// 3. 데이터 존재 여부 확인
		System.out.println("=== contains ===");
		if (kangwon.contains("강릉시")) {
			System.out.println("강릉시는 Set에 존재합니다.");
		}
		
		// 4. Set 정렬(List로 변환 후 정렬)
		System.out.println("=== 정렬 ===");
		List<String> listSet = new LinkedList<>(kangwon);
		Collections.sort(listSet);
		
		for (String s : listSet) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
