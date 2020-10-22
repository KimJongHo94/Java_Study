package classEx;

public class DogClass {

	public static void main(String[] args) {
		// 클래스를 만들면 객체를 만들 수 있다.
		// Dog 객체 생성
		Dog d = new Dog();
		//  만들어진 객체에 변수 d를 입힌다 = 객체 생성(new Dog())
		
		// Dog 객체 필드 값 출력
		System.out.printf("이름 : %s\n", d.name);
		System.out.printf("품종 : %s\n", d.breeds);
		System.out.printf("나이 : %s\n", d.age);
		// String 기본값 : null
		// int    기본값 : 0
	}

}

class Dog {
	/* 필드 영역 */
	String name;	// 이름
	String breeds;  // 품종
	int age;		// 나이
	
	/* 메소드 영역 */
	void wag() {	// 꼬리치기
		System.out.println("살랑살랑 꼬리를 친다!");
	}
	
	void bark() {	// 개가 짖는 동작!
		System.out.println("멍멍! 개가 짖습니다!");
	}
}

/*
실행 결과
이름 : null
품종 : null
나이 : 0
*/
