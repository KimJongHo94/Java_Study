package Study;

public class Test002 {

	public static void main(String[] args) {
		
		// 변수 선언
		int a;
		
		// 변수 초기화(변수 a에 10을 대입)
		a = 10;
		
		// 변수 선언 및 초기화
		int b = 20;
		
		// 변수 선언
		int c;
		
		// 테스트
		System.out.println(a);	// 실행결과 : 10
		System.out.println(b);  // 실행결과 : 20
		
		// 에러 사유 : 초기화 되지 않은 지역 변수에 접근하여 출력을 시도
		// System.out.println(c);		==> 컴파일 에러
		// 실행 결과 : java:29: error: variable c might not have been initialized

		// 연산 및 처리
		c = a + b;
		
		// 테스트
		System.out.println(c);	// 실행결과 : 30
		
		// System.out.println(a b c); ==> 에러 발생(컴파일 에러)
		
		
		
		// 출력 내가 풀이한 내용)
		System.out.print(a + " " + b + " " + c + " \n");
		System.out.print(a + "\t" + b + " \t" + "\n");
		
		// # 덧셈 연산자(+)
		// 피연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면
		// 산술연산자로써 기능을 수행하는 것이 아니라
		// 문자열 결합 연산자로서의 기능을 수행하게 된다.
		
		System.out.println("a의 값은 " + a + "입니다.");
		System.out.println("b의 값은 " + b + "입니다.");
		System.out.println("c의 값은 " + c + "입니다.");
		
	}

}
