package chapter.chapter13_Collection;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

/*
	[TreeSet]
	특징
		1. 중복 데이터 저장 가능
		2. 저장될 때 자동 절렬
		3. 내부적으로 이진트리 구조 사용
 */
public class C113_TreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(2);
		ts.add(5);
		ts.add(1);
		ts.add(4);
		ts.add(2);	// 중복 데이터
		
		System.out.println("저장된 데이터 개수 : " + ts.size());
		System.out.println();
		
		System.out.println("=== Iterator 출력 ===");
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("=== foreach 출력 ===");
		for (Integer n : ts) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// TreeSet 주요 메서드
		System.out.println("가장 작은 값 : "+ts.first());
		System.out.println("가장 작은 값 : " + ts.last());
		
		System.out.println("3보다 큰 값 : "+ts.higher(3));
		System.out.println("3보다 작은 값 : "+ts.lower(3));
	}
}
