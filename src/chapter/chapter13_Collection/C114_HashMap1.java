package chapter.chapter13_Collection;

import java.util.HashMap;
import java.util.Map;

/*
	[HashMap]
	- key 와 value 형태로 데이터를 저장하는 컬랙션
	- key 는 중복 불가능
	- value 는 중복 가능
	- 검색 속도가 빠름
 */
public class C114_HashMap1 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> snack = new HashMap<>();
		
		// 데이터 저장
		snack.put("오징어 땅콩", 2500);
		snack.put("죠리퐁", 1900);
		snack.put("핫브레이크", 450);
		snack.put("빼빼로", 900);
		
		// 같은 key를 넣으면 값이 수정됨
		snack.put("빼빼로", 1000);
		
		System.out.println("=== 전체 출력 ===");
		// entrySet() 은 Map 데이터를 Entry(key+value) 묶음으로
		// 즉, Set 으로 바꿔서 반복문에서 쉽게 쓰게 해주는 메서드
		for (Map.Entry<String, Integer> entry : snack.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		String mySnack = "죠리퐁";
		
		// containsKey : key 존재 여부 확인
		if (snack.containsKey(mySnack)) {
			System.out.println(mySnack+"의 가격은 "+snack.get(mySnack)+"원 입니다.");
		}
		
		// remove : 데이터 삭제
		snack.remove(mySnack);
		// 삭제 후 조회
		System.out.println(mySnack + "의 가격: " + snack.get(mySnack) + "원 입니다.");
		//현재 HashMap 크기
		System.out.println("현재 과자 종류 수 : "+snack.size());
	}
}
