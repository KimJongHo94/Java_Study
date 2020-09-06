package whileEx;

/*
 * # 반복문 for
 * 1. 반복문의 조건 3가지
 * 1) 초기식
 * 2) 조건식
 * 3) 증감식
 * 
 * 2. for문의 구조
 * for(초기식; 조건식; 증감식) {
 * 		조건식이 참일 동안 실행할 문장;
 * }
 * 
 * 3. for문의 실행순서
 * 초기식 → 조건식 → 실행문 → 증감식 → 조건식 → 실행문 → 증감식 ...
 */

public class WhileEx19 {

	public static void main(String[] args) {
		
		// 1 ~ 5까지 출력
		int x = 1;
		while(x <= 5) {
			System.out.println(x);
			x += 1;
		}
		System.out.println();
		
		for(int y = 1; y <= 5; y++) {
			System.out.println(y);
		}
		
		System.out.println();
		
		// 문제1) 1부터 5까지 출력
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 문제2) 1부터 10까지 반복해, 5 ~ 9까지 출력
		for(int i = 1; i <= 10; i++) {
			if(5 <= i && i <= 9) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 문제3) 1부터 10까지 반복해 6 ~ 3까지 출력
		for(int i = 10; i >= 1; i--) {
			if(6 >= i && i >= 3) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 문제4) 1부터 10까지 반복해 3미만 7이상 출력
		for(int i = 1; i <= 10; i++) {
			if(3 > i || i >= 7) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
	}

}
