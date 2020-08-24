package ifEx;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */

public class IfEx05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== 회 원 가 입 ===");
		
		System.out.print("아이디 입력 : ");
		int dbId = scan.nextInt();
		System.out.print("비밀번호 입력 : ");
		int dbPw = scan.nextInt();

		System.out.println("회원가입을 축하드립니다!!");
		
		System.out.println();
		
		System.out.println("=== 로 그 인 ===");
		
		System.out.print("아이디 입력 : ");
		int myId = scan.nextInt();
		System.out.print("비밀번호 입력 : ");
		int myPw = scan.nextInt();
		
		if(dbId == myId && dbPw == myPw) {
			System.out.println("로그인 성공");
		}
		if(dbId != myId || dbPw != myPw) {
			System.out.println("로그인 실패");
		}

	}

}
