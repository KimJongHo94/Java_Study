package review;

public class OpEx08 {

	public static void main(String[] args) {
	
		// 예) 3의 배수이면서, 짝수이면 true 출력
		int num = 12;
		System.out.println(num % 3 == 0 && num % 2 == 0);
		
		// 문제1) 과락
		// 3과목의 평균이 60점 이상이면, true
		// 단, 어느 한 과목이라도 50점 미만이면, false
		int kor = 100;
		int eng = 87;
		int math = 41;
		int avg = (kor + eng + math) / 3;
		
		System.out.println(kor >= 60 && eng >= 60 && math >= 60 && avg >= 50);
		
		// 문제2) 키가 200cm이상이거나 몸무게가 200kg 이상이면, 입장(true)
		int height1 = 199;
		int weight1 = 199;
		System.out.println(height1 >= 200 || weight1 >= 200);
		
		int height2 = 200;
		int weight2 = 68;
		System.out.println(height2 >= 200 || weight2 >= 200);
	}

}
