package chapter.chapter13_Collection;

/*
	[LinkedList]
	노드(node)가 서로 연결된 구조
	데이터 추가/삭제가 유리
	
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class C110_LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		List list2 = new LinkedList<>();
		
		// 데이터 추가
		list.add("사과");
		list.add("바나나");
		list.add("포도");
		
		// 원하는 위치에 데이터 추가
		list.add(1,"딸기"); // index1 위치에 데이터 삽입
		
		// 데이터 삭제
		list.remove("딸기"); // 딸기 데이터값 삭제
		list.remove(1); // 인덱스 값 삭제
		
		
		// for-each 반복문
		System.out.println("=== for-each 문 ===");
		for (String fruit : list) {
			System.out.println(fruit);
		}
		
		/*
			Iterator
			컬랙션(Collection)에 저장된 데이터를 하나씩 순차적으로
			꺼내기 위해 사용하는 객체
			
			특징
			컬랙션 종류와 상관없이 동일한 방식으로 사용 가능
			
			hasNext() 	다음 데이터가 있는지 확인 true / false
			next()		다음 데이터를 꺼내면서 커서 이동
		 */
		System.out.println("=== Iterator 순회 ===");
		Iterator<String> it = list.iterator();        // Iterator 객체 생성
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
