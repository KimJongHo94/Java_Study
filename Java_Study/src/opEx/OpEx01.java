package opEx;

/*
 * # 연산자(operator)
 * 1. 산술 연산자
 * 1) 더하기 +
 * 2) 빼기    -
 * 3) 곱하기 *
 * 4) 나누기 /
 * 5) 나머지 %
 * 
 */


public class OpEx01 {
	public static void main(String[] args) {
		
		System.out.println(10 + 3);
		// 13
		System.out.println(10 - 3);
		// 7
		System.out.println(10 * 3);
		// 30
		
		// 정수 / 정수 = 정수
		System.out.println(10 / 3);
		// 3
		
		// 정수 / 실수 = 실수
		// 실수 / 정수 = 실수
		System.out.println(10 / 3.0);
		// 3.3333333333333335
		
		System.out.println(10 % 3);
		// 1
		
		
	}
}
