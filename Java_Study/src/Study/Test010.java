package Study;

/*
●●● 자바 기본 프로그래밍 ●●●

- 변수와 자료형
- 자바의 기본 입출력 : BufferedReader 클래스 
*/



//System.in -> 바이트 입력 흐름
//new BufferedReader(번역기(System.in))
//new BufferedReader(new InputStreamReader(System.in));

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test010 {

	public static void main(String[] args) throws IOException {
		
		// BufferedReaer 인스턴스 생성 구문
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언
		int r;							// 반지름
		final double PI = 3.141592;		// 원주율
		double a, l;					// 넓이, 둘레
		
		// 연산 및 처리
		
		// 1. 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");
		
		// 2. 사용자가 입력한 값을 받아와 반지름 변수 r 에 담아내기
		
		// BufferedReader 안에... readLine() 메소드... 외부 입력값 가져오기
		// r = br.readLine();
		// r = "30"   -------------- (x)
		// r = parseInt()			 -- 매개변수로 넘겨받은
		//                              숫자 모양의 문자열 데이터를 정수형으로 변환
		// r = Integer.parseInt();   -> Intger 에 들어있는 parseInt();
		// r = Integer.parseInt("30");
		
		r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt(br.readLine());
		
		// r = 30;
		
		// 사용자가 입력한 값을 BufferedReader(br) 의 [ readLine() ]
		// 메소드를 활용하여 읽어들인 후
		// 그 값을 [ Integer.parseInt() ] 를 통해 숫자형(정수형)으로 변환한 후
		// 정수 형태의 반지름 변수 r 에 담아내기
		
		// 3. 원의 넓이 및 둘레 연산
		a = r * r * PI;
		l = r * 2 * PI;
		
		// 결과 출력
		
		/*
		 System.out.println(">> 넓이 : " + a);
		 System.out.println(">> 둘레 : " + l);
		 */
		
		/*
		 System.out.printf(">> 넓이 : %.2f\n", a);
		 System.out.printf(">> 둘레 : %.2f\n", l);
		 */
		
		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", l);
		
		// [ %f ] 는 실수형을 받아내는 옵션 문자
		// [ %.2f ] 는 소수점 이하 두 번째 자리까지 표현하겠다는 의미
		// 세 번째 자리에서 반올림

	}

}
