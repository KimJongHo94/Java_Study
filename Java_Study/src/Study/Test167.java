/*

	컬렉션 프레임워크(Collection Framework)

*/

// 벡터 자료구조 객체 선언 및 생성 시
// 사용자 정의 클래스 활용 → 자료형

import java.util.Vector;

// 사용자 정의 클래스 설계 → 자료형처럼 활용
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;		//-- 이름
	private int age;			//-- 나이

	// getXxx() → getter
	// setXxx() → setter

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 생성자(매개변수 2개인 생성자) → 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age  = age;
	}

	// 생성자(매개변수가 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}

}

public class Test167 {

	public static void main(String[] args) {

		// 벡터 자료구조 v 생성
		Vector<MyData> v = new Vector<MyData>();

		// 벡터 자료구조 v 에
		// 박다빈 13세 / 박민하 7세 / 박해진 58세
		// 담아내기

		

	}

}