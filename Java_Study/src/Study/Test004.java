package Study;

public class Test004 {

	public static void main(String[] args) {
		
		// 변수 선언 및 초기화(메모리에 값 할당)
		int a = 10, b = 5;
		
		// 변수 선언
		int c, d;
		
		// 연산 및 처리
		c = a + b;		// a + b 의 결과값을 변수 c 에 대입하라
		d = a - b;		// a - b 의 결과값을 변수 d 에 대입하라
		
		// 결과 출력
		System.out.println(a + " + " + b + " = " + c);
		// ==> 10 + 5 = 16
		//                숫자       문자열     숫자       문자열     숫자
		// 자바에서는 서로 다른 자료형의 데이터들끼리도
		// [ + ] 연산이 가능하며
		// 다른 어떤 자료형과 문자열 데이터의 [ + ] 연산 결과는 문자열
		// 즉, 문자열 결합 연산자로서 [ + ]
		
		System.out.println(a + " - " + b + " = " + d);
		
		// print() / println() / print() / format()
		
		// printf() / format()
		// JDK 1.5 부터 지원되는 메소드
		// System.out.printf("O + O + O", 10, 20, 30);
		
		System.out.printf("%d + %d + %d\n", 10, 20, 30);
		System.out.printf("%d + %d + %d%n", 10, 20, 30);
		
		System.out.printf("%d 과 %f\n", 10, 3.14);
		// ==> 10 과 3.14000
		
		// System.out.printf("%d + %d\n", 10, 3.14);
		// ==> 10 과 3.141592
		
		System.out.printf("%d 과 %f\n", 10, 3.141592);
		// ==> 10 과 3.141592
		
		System.out.printf("%d 과 %.2f\n", 10, 3.141592);
		// ==> 10 과 3.1416 => 반올림
		// 소수점 이하 네 번째 자리까지 표현
	

	}

}
