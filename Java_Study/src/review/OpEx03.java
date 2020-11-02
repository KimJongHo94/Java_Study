package review;

public class OpEx03 {

	public static void main(String[] args) {
		
		// 예) 현금이 1000원 있다. 200원짜리 과자 구입 후, 잔돈 출력
		System.out.println(1000 - 200);
		System.out.println("잔돈 = " + (1000 - 200) + "원");
		
		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		System.out.println("연봉 = " + (100 * 12) * 0.9);
		
		// 문제2) 시험점수를 30, 50, 4점을 받았다. 평균은?
		System.out.println("평균 = " + (30 + 50 + 4) / 3.0 + "점");
		
		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println("넓이 = " + (3 * 6) / 2.0);

		// 문제4) 100초를 1분 40초로 출력
		System.out.println((100 / 60) + "분 " + (100 % 60) + "초");
		
		// 문제5) 800원에서 500원짜리 개수, 100원짜리 개수 출력
		System.out.println("500원 개수 = " + (800 / 500) + "개");
		System.out.println("100원 개수 = " + (800 % 500) / 100 + "개");
	}

}
