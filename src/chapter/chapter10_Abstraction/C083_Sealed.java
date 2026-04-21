package chapter.chapter10_Abstraction;

/*
	[상속 제한자]
	final : 더 이상 상속 불가
	sealed : 지정한 자식 클래스만 상속 허용
	non-sealed : sealed 키워드가 붙은 상속 제한을 해제하고 자유롭게 상속 허용
	
	why?
		1. 상속 구조를 명확하게 제한하기 위해서
		2. 설계자가 허용한 클래스만 상속받기 위해서
		3. 컴파일러가 상속 구조를 정확히 파악하기 위해서
		
	sealed class
		상속 가능한 자식을 제한할 수 있는 클래스가 됨
	문법
		selaed class 부모클래스 permits 자식1, 자식2, 자식3 {}
 */

abstract sealed class Language permits Java, Cpp, CSharp { };

// final : 더 이상 자식 클래스르 만들 수 없음
final class Java extends Language { }

//final class Python extends Language { } // permits에 없으므로 상속 불가
//final class OpenJava extends Java{ } // Java가 final 클래스이므로 상속 불가

// sealed : 지정한 자식에게만 상속 허용
sealed class Cpp extends Language permits C11, C20{ }

// Cpp로부터 두 개의 클래스만 파생 가능
final class C11 extends Cpp{}
final class C20 extends Cpp{}

// CSharp 은 non-sealed 이므로 자유롭게 상속 가능
non-sealed class CSharp extends Language{ }
class CSharpCore extends CSharp { }



public class C083_Sealed {
	public static void main(String[] args) {
		Language lanJava = new Java();
		Language lanCpp = new Cpp();
		Language lanCSharp = new CSharp();
		Language CSharpCore	 = new CSharpCore();
		
		outLanguageName(lanJava);
		outLanguageName(lanCpp);
		outLanguageName(lanCSharp);
		outLanguageName(CSharpCore);
		
	}
	
	public static void outLanguageName(Language lang) {
		
		// 제한된 상속 구조를 가지고 있으므로
		// Language의 실제 하위 타입 범위를 예측하기 쉽다.
		if (lang instanceof Java) {
			System.out.println("자바입니다.");
		} else if (lang instanceof Cpp) {
			System.out.println("C++ 입니다.");
		} else if (lang instanceof CSharp) {
			System.out.println("C# 입니다.");
		} else {
			System.out.println("기타 언어 입니다.");
		}
	}
}

// sealed interface
// 인터페이스도 sealed를 사용할 수 있음
sealed interface Payment permits Cash, Card, Bank { }
final class Cash implements Payment { }
final class Card implements Payment { }
final class Bank implements Payment { }
