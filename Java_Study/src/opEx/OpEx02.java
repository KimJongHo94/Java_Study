package opEx;

public class OpEx02 {

	public static void main(String[] args) {
		
		// 1. 덧셈 연산자
		System.out.println(10 + 3);
		
		// 2. 연결 연산자
		// 1) "문자" + "문자" = "문자"
		System.out.println("안녕" + "하세요");
		// 안녕하세요
		
		// 2) 숫자 + "문자" = "문자"
		System.out.println(3 + "10");
		// 310
		
		// 3) "문자" + 숫자 = "문자"
		System.out.println("10" + 3);
		// 103
		
		System.out.println("더하기 = " + 10 + 3);
		// 더하기 = 103
		
		System.out.println("더하기 = " + (10 + 3));
		// 더하기 = 13

	}

}
