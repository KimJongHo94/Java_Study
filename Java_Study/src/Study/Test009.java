package Study;

/*
●●● 변수와 자료형 ●●●

- 퀴즈
  사전에 부여된 반지름 정보를 통해
  원의 넓이와 둘레를 구하는 프로그램을 구현한다.
  -> 반지름 : 10
*/

//원의 넓이 : 반지름 * 반지름 * 원주율(3.141592)
//원의 둘레 : 반지름 * 2 * 원주율(3.141592)

//실행 예)
//넓이 : xxxx
//둘레 : xxxx
//계속하려면 아무 키나 누르세요...


public class Test009 {

	public static void main(String[] args) {
		
		// 행 단위 주석문(단일행 주석문)은
		// 블럭단위 주석문(다중행 주석문)으로 처리할 수 있지만
		// 불럭단위 주석문은 이름 감싸는 또다른 블럭단위 주석문으로 처리할 수 없다.
		
		// 내가 작성
		double i = 10.0;
		
		double x = i * i * 3.141592;
		double y = i * 2 * 3.141592;
		
		System.out.println("원의 넓이 : " + x);
		System.out.println("원의 둘레 : " + y);
		
		// 해결코드
		
		// 주요 변수(반지름, 원주율 , 넓이, 둘레)
		
		int r = 10;						// 반지름
		final double PI = 3.141592;		// 원주율
		// double pi = 3.141592
		// [ final ] : 변수의 상수화
		
		double area, length;			// 넓이, 둘레
		
		area = r * r * PI;
		length = r * 2 * PI;
		
		System.out.println("원의 넓이 : " + area);
		System.out.println("원의 둘레 : " + length);
		
		System.out.printf("원의 둘레 : %f\n", length);
	}

}
