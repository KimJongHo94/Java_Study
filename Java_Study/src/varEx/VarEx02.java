package varEx;

public class VarEx02 {

	public static void main(String[] args) {
		
		// 예) 현금이 1000원 있다. 200원짜리 과자 구입 후, 잔돈 출력
		int 현금 = 1000;
		int 과자 = 200;
		int 잔돈 = 현금 - 과자;
		System.out.println("잔돈 = " + 잔돈 + "원");
		// 잔돈 = 800원
		
		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int 월급 = 100;
		int 세전연봉 = 월급 * 12;
		int 세금 = 세전연봉 / 10;
		int 세후연봉 = 세전연봉 - 세금;
		System.out.println("연봉 = " + 세후연봉 + "원");
		// 연봉 = 1080원
		
		// 문제2) 시험점수를 30, 50, 4점을 받았다. 평균은?
		int score1 = 30;
		int score2 = 50;
		int score3 = 4;
		int tot = score1 + score2 + score3;
		double avg = tot / 3.0;
		System.out.println("평균 = " + avg + "점");
		// 평균 = 28.0점
		
		// 문제4) 100초를 1분 40초로 출력
		int min = 100 / 60;
		int sec = 100 % 60;
		System.out.println(min + "분" + " " + sec + "초");
		// 1분 40초
		
		// 문제5) 800원에서 500원짜리 개수, 100원짜리 개수
		// 정답5) 500원(1개), 100원(3개)
		int five = 800 / 500;
		int one = (800 % 500) / 100;
		System.out.printf("500원(%d개), 100원(%d개)\n", five, one);
		// 500원(1개), 100원(3개)

	}

}
