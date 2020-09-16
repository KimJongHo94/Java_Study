package Study;

public class Test008 {

	public static void main(String[] args) {
		
		// 정수와 정수의 나눗셈
		double a = 1 / 2;
		
		System.out.println("double a : " + a);
		// ==> double a : 0.0
		
		double b = 1 / 2 + 1 / 2;
		System.out.println("double b : " + b);
		// ==> double b : 0.0
		
		double c = 1 / 2.0;
		System.out.println("double c : " + c);
		// 나눗셈 연산과 관련하여
		// 피연산자 중 실수가 포함되어 있다면
		// 연산은 실수 기반의 연산이 수행되며
		// 결과값 또한 실수 형태로 변환된다.
		
		// ==> double c : 0.5
		
		double d = 3 / 2 + 1 / 2;
		System.out.println("double d : " + d);
		// ==> double d : 1.0
		
		double e = (3 / 2) + (1 / 2.0);
		System.out.println("double e : " + e);
		// ==> double e : 1.5

	}

}
