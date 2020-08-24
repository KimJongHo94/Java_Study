package ifEx;

/*
 * # 제어문(Control Statment)
 * 1. 조건문 : if, switch-case
 * 2. 반복문 : for, while, do-while
 * 3. 보조 제어문 : break, continue
 * 
 * # 조건문 if
 * 
 * if(조건식) {
 * 		조건식이 참(true)일 때 실행할 문장;
 * }
 */

public class IfEx01 {

	public static void main(String[] args) {
		
		if(true) {
			System.out.println("실행 O");
		}
		
		if(false) {
			System.out.println("실행X");
		}
		
		// 예) 홀짝
		int num = 8;
		System.out.println(num % 2 == 0);
		System.out.println(num % 2 == 1);
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		if(num % 2 == 1) {
			System.out.println("홀수");
		}
		
		// 문제1) 양수, 0, 음수 출력
		num = -10;
		if(num > 0) {
			System.out.println("양수입니다");
		}
		if(num == 0) {
			System.out.println("0 입니다.");
		}
		if(num < 0) {
			System.out.println("음수입니다.");
		}
		
		// 문제2) 4의 배수 출력
		num = 12;
		if(num % 4 == 0) {
			System.out.println("4의 배수입니다.");
		}
		else {
			System.out.println("4의 배수가 아닙니다.");
		}
		
		// 문제3) 합격, 불합격 출력
		int score = 87;
		if(score >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
	}

}
