package whileEx;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 */

public class WhileEx10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int log = -1;
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					
					System.out.print("계좌번호 입력 : ");
					int acc = scan.nextInt();
					
					System.out.print("비밀번호 입력 : ");
					int pw = scan.nextInt();
					
					if(acc == dbAcc1 && pw == dbPw1) {
						log = 1;
						System.out.println("환영합니다. " + dbAcc1 + "님");
					}
					else if(acc == dbAcc2 && pw == dbPw2) {
						log = 2;
						System.out.println("환영합니다. " + dbAcc2 + "님");
					}
					else {
						System.out.println("계좌번호와 비밀번호를 확인해주세요.");
					}
					
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("로그아웃 되었습니다.");
				}
				else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if(sel == 3) {
				if(log == 1) {
					
					System.out.print("입금할 금액 입력 : ");
					int money = scan.nextInt();
					
					dbMoney1 += money;
					System.out.println("입금이 완료되었습니다.");
					
				}
				else if(log == 2) {
					
					System.out.print("입금할 금액 입력 : ");
					int money = scan.nextInt();
					
					dbMoney2 += money;
					System.out.println("입금이 완료되었습니다.");
				}
				else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if(sel == 4) {
				if(log == 1) {
					
					System.out.print("출금할 금액 입력 : ");
					int money = scan.nextInt();
					
					if(money <= dbMoney1) {
						dbMoney1 -= money;
						System.out.println("출금이 완료되었습니다.");
					}
					else {
						System.out.println("잔액이 부족합니다.");
					}
					
				}
				else if(log == 2) {
					
					System.out.print("출금할 금액 입력 : ");
					int money = scan.nextInt();
					
					if(money <= dbMoney2) {
						dbMoney2 -= money;
						System.out.println("출금이 완료되었습니다.");
					}
					else {
						System.out.println("잔액이 부족합니다.");
					}
				}
				else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if(sel == 5) {
				if(log == 1) {
					
					System.out.print("이체할 계좌번호 입력 : ");
					int transAcc = scan.nextInt();
					
					if(transAcc == dbAcc2) {
						System.out.print("이체할 금액 입력 : ");
						int money = scan.nextInt();
						
						if(money <= dbMoney1) {
							dbMoney1 -= money;
							dbMoney2 += money;
							System.out.println("이체가 완료되었습니다.");
						}
						else {
							System.out.println("잔액이 부족합니다.");
						}
					}
					else {
						System.out.println("계좌번호를 확인해주세요.");
					}
				}
				else if(log == 2) {
					
					System.out.print("이체할 계좌번호 입력 : ");
					int transAcc = scan.nextInt();
					
					if(transAcc == dbAcc1) {
						System.out.println("이체할 금액 입력 : ");
						int money = scan.nextInt();
						
						if(money <= dbMoney2) {
							dbMoney1 += money;
							dbMoney2 -= money;
							System.out.println("이체가 완료되었습니다.");
						}
						else {
							System.out.println("잔액이 부족합니다.");
						}
						
					}
					else {
						System.out.println("계좌번호를 확인해주세요.");
					}
					
				}
				else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if(sel == 6) {
				
				if(log == 1) {
					System.out.println("dbAcc1 잔액 = " + dbMoney1 + "원") ;
				}
				else if(log == 2) {
					System.out.println("dbAcc2 잔액 = " + dbMoney2 + "원");
				}
				else {
					System.out.println("로그인 상태가 아닙니다.");
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}

	}

}
