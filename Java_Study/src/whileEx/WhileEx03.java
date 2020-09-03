package whileEx;

// # 반복문 기본문제[2단계]

public class WhileEx03 {

	public static void main(String[] args) {
		
		// 문제1) 1 ~ 5까지의 합 출력
		int i = 1;
		int sum = 0;
		
		while(i <= 5) {
			sum += i;
			i++;
		}
		System.out.println("1~5까지의 합 : " + sum);
		
		// 문제2) 1 ~ 10까지 반복해 3미만 7이상만 출력
		i = 1;
		while(i <= 10) {
			if(3 > i || i >= 7) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		i = 1;
		sum = 0;
		
		while(i <= 10) {
			if(3 > i || i >= 7) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		i = 1;
		int cnt = 0;
		
		while(i <= 10) {
			if(3 > i || i >= 7) {
				cnt += 1;
			}
			i++;
		}
		System.out.println(cnt);

	}

}
