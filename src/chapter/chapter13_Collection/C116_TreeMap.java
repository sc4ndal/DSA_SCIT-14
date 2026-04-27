package chapter.chapter13_Collection;

/*
	[TreeMap]
	- Map 인터페이스의 구현 클래스
	- Key 를 기준으로 자동 정렬됨
	- 내부적으로 이진 트리 구조 사용
	- 검색, 삽입, 삭제가 모두 정렬 상태로 유지
 */

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C116_TreeMap {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		// 데이터 저장
		treeMap.put(1, "부산");
		treeMap.put(2, "대전");
		treeMap.put(3, "대구");
		treeMap.put(4, "광주");
		treeMap.put(5, "인천");
		treeMap.put(6, "울산");
		
		System.out.println("=== TreeMap 전체 출력(자동 정렬) ===");
		System.out.println(treeMap);
		
		// 저장된 Entry 개수
		System.out.println("총 Entry 수 : " + treeMap.size());
		System.out.println();
		
		// 값 검색
		String city = treeMap.get(1);
		System.out.println("Key 1의 값 : " + city);
		System.out.println();
		
		// 존재 여부 확인
		System.out.println("Key 3 존재 여부 : "+treeMap.containsKey(3));
		System.out.println("Value 서울 존재 여부 : "+treeMap.containsValue("서울"));
		System.out.println();
		
		// key 만 가져오기
		Set<Integer> keySet = treeMap.keySet();
		System.out.println("key 목록 : "+keySet);
		System.out.println();
		
		System.out.println("=== Iterator ===");
		// Iterator
		Iterator<Integer> keyIt = keySet.iterator();
		
		while (keyIt.hasNext()) {
			Integer key = keyIt.next();
			String value = treeMap.get(key);
			System.out.println("키 : "+key+" | 값 : "+value);
		}
		
		/*
			entrySet() Set<Map, Entry<K, V>>	key-value 쌍을 모두 꺼냄
			keySet()	Set<K>					key만 꺼냄
		 */
		System.out.println("=== entrySet ===");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("키 : "+ entry.getKey()+", 값 : "+entry.getValue());
		}
	}
}
