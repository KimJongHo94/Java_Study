package Study;

public class Test005 {

	public static void main(String[] args) {
		
		int a;
		a = 10;
		System.out.println("a의 결과 : " + a);
		
		int b = 20;
		System.out.println("b의 결과 : " + b);
		
		short c;
		
		// 연산 및 처리(대입 연산)
		// c = a;
		// ==> 에러 발생(컴파일 에러)
		// ==> 기본적으로는 자료형이 작은 것에 큰 것을 담지 못한다.
		// (자동 형 변환 규칙 위반)
		
		// 명시적인 형 변환(강제 형 변환)
		c = (short)a;
		
		// 변수 a 가 가지고 있는 데이터를
		// short 형으로 형 변환을 수행한 후
		// 변수 c 에 대입한다.
		
		// 00000000 00000000 00000000 00001010 -> int 형 a 변수 10
		//		형	변	환
		// 00000000 00001010				   -> short 형 10
		
		// 결과 출력
		System.out.println("c의 결과 : " + c);
		// ==> c 의 결과 : 10
		
		// 변수 선언 및 초기화
				// long d = 10000000000;    // 백억
				// 접미사 [ L ] 이 중요하다
				// long 형은 숫자(상수) 뒤에 [ L ] 또는 [ l ]을 붙여
				// 상수를 표현해야 한다.
				// 즉, 약 21억 이상 되는 상수에는 데이터 뒤에 접미사를
				// 꼭 붙여줄 수 있도록 한다.
				

				long d = 10000000000L; 

				// 결과 출력
				System.out.println("d의 결과 : " + d);

				// 변수 선언 및 초기화;
				int e = 030;
				// 0 자체가 접두어


				// 결과 출력
				System.out.println("e의 결과 : " + e);
				// ==> e의 결과 : 24
				// 접두사 [ 0 ] -> 8진수
			
				// 변수 선언 및 초기화
				int f = 0xa6;

				// 결과 출력
				System.out.println("f의 결과 : " + f);
				// ==> f의 결과 : 166
				// 접두사 [ 0x ] -> 16진수

				// 0 1 2 3 4 5 6 7 8 9 a b c d e f

				

				// 변수 선언 및 초기화
				float g = 0.0F;
				// ==> 접미사 [ f ] , [ F ] 

				// 결과 출력
				System.out.println("g의 결과 : " + g);


	}

}
