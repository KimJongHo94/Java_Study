package ifEx;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 로그인 ==> 1.입금 2.출금 3.조회
		int cash = 20000;		// 입금시 감소, 출금시 증가
		int balance = 30000;	// 입금시 증가, 출금시 감소
		int account = 1111;		// 로그인시 사용
		int password = 1234;	// 로그인시 사용
		
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int sel = scan.nextInt();
		
		if(sel == 1) {
			System.out.print("계좌와 비밀번호를 입력해주세요 : ");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			
			if(acc == account && pw == password) {
				System.out.print("1.입금 2.출금 3.조회");
				sel = scan.nextInt();
				
				if(sel == 1) {
					System.out.print("입금할 금액을 입력 : ");
					int deposit = scan.nextInt();
					
					if(deposit <= cash) {
						deposit -= cash;
						deposit += balance;
						System.out.println("입금을 완료했습니다.");
					}
					else {
						System.out.println("잔액이 부족합니다.");
					}
				}
				else if(sel == 2) {
					System.out.print("출금할 금액을 입력 : ");
					int withdraw = scan.nextInt();
					
					if(withdraw <= balance) {
						cash += withdraw;
						balance -= withdraw;
						System.out.println("출금을 완료했습니다.");
					}
					else {
						System.out.println("잔액이 부족합니다.");
					}
				}
				else if(sel == 3) {
					System.out.println("조회 : " + balance + "원");
				}
			}
			else {
				System.out.println("계좌번호와 비밀번호를 확인해주세요.");
			}
		}
		else if(sel == 2) {
			System.out.println("종료");
		}

	}

}
