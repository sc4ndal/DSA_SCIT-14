package chapter.chapter11_Object;

public class C092_String2 {
	
	public static void main(String[] args) {
/*
		String 주요 메서드
		
		1. 길이 / 문자 추출
			- length()  : 문자열 길이
			- charAt()  : 특정 위치의 문자
		2. 검색
			- indexOf()     : 앞에서부터 찾기(특정 문자가 시작되는 인덱스를 리턴)
			- lastIndexOf() : 뒤에서부터 찾기
			- contains()    : 포함 여부
		3. 비교 / 시작 / 끝 확인
			- equals()      : 문자열 비교
			- startsWith()  : 특정 문자열로 시작하는지
			- endsWith()    : 특정 문자열로 끝나는지
		4. 변환
			- toUpperCase() : 대문자 변환
			- toLowerCase() : 소문자 변환
			- replace()     : 문자열 치환
			- trim()        : 양쪽 공백 제거
		5. 분리 / 추출 / 연결
			- substring()   : 문자열 일부 추출
			- split()       : 문자열 분리(배열 리턴)
			- concat()      : 문자열 연결
			- join()        : 구분자를 넣어 문자열 연결
*/
		
		// 1. 길이 / 문자 추출
		String str = "아름다운 우리나라";
		System.out.println("길이 : " + str.length());
		System.out.println("2번째 문자 : " + str.charAt(1));
		System.out.println();
		
		// 2. 검색
		String str2 = "String Search Method of String Class";
		System.out.println("앞쪽 t : " + str2.indexOf('t'));
		System.out.println("뒤쪽 t : " + str2.lastIndexOf('t'));
		System.out.println("z 포함 위치 : " + str2.indexOf('z'));   // 없으면 -1
		System.out.println("String 포함 여부 : " + str2.contains("String"));
		System.out.println();
		
		// 3. 시작 / 끝 확인
		String str3 = "girl.jpg";
		System.out.println("g로 시작 : " + str3.startsWith("g"));
		System.out.println(".jpg로 끝 : " + str3.endsWith(".jpg"));
		System.out.println();
		
		// 4. 대소문자 변환
		String str4 = "Kim Sang Hyung";
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		
		// String은 원본이 직접 바뀌지 않음
		System.out.println("원본 : " + str4);
		str4.toUpperCase();
		System.out.println("변경 후 : " + str4);
		System.out.println();
		
		// 5. 공백 제거 / 문자열 연결
		String str5 = "      Kim Sang Hyung    ";
		System.out.println(str5.trim());
		System.out.println(str5.trim().concat(" BABO"));
		System.out.println();
		
		// 6. 문자열 치환
		String str6 = "사과는 맛있다. 바나나도 맛있다.";
		System.out.println(str6.replace("맛있다", "달다"));
		System.out.println(str6.replaceFirst("맛있다", "달다"));
		System.out.println();
		
		// 7. 부분 문자열 추출
		String str7 = "0123456789";
		System.out.println(str7.substring(3));     // 3번부터 끝까지
		System.out.println(str7.substring(3, 7));  // 3번부터 6번까지
		System.out.println();
		
		// 8. 문자열 분리
		String city = "서울,대전,대구,부산";
		String[] token = city.split(",");
		for (String s : token) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println();
		
		// 9. 문자열 연결
		String path = String.join("/", "user", "data", "app", "local");
		System.out.println(path);
	}
}