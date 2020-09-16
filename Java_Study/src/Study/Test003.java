package Study;

public class Test003 {

	public static void main(String[] args) {
		
		double height = 172.8;
		int age = 25;
		char degree = 'A';
		
		// String 클래스라서 첫 글자는 대문자
		String name = "홍길동";
		
		// String name = "아무무";
		// 스코프(scope) 영역 안에서 변수명은 식별자
		
		// String #name = "땡땡땡;
		// [ $ ] [ _ ] 를 제외한 다른 특수문자는
		// 변수의 이름으로 활용할 수 없다.
		// 하지만, 그나마 사용 가능한 이들 특수문자도
		// 함부로 이용하는 것은 고려해야 한다.
		
		
		
		// int tel = 01011115678;
		String tel = "01011115678";
		
		String _tel = "010-1111-5678";
		
		String 주소 = "경기도 고양시";
		// 문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		// 실무적인 측면에서 접근한다면
		// 절대로 한글 단어를 변수명으로 사용해서는 안된다.
		
		// 결과 출력
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("tel : " + tel);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);

	}

}
