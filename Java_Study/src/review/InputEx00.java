package review;

import java.util.Scanner;

public class InputEx00 {

	public static void main(String[] args) {
		
		/*
		   # 입력받기
		   
		   1. import java.util.Scanner; // 패키지 문 밑에 작성한다.
		   
		   2. Scanner scan = new Scanner(System.in);	
		   
		   3. 안내문 작성
		      System.out.print("나이를 입력하세요 : ");
		      
		   4. 입력받기
		      int age = scan.nextInt();
		      
		   5. 결과출력
		      System.out.println("당신의 나이는 " + age + "세 이군요!");
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("입력하신 숫자는 " + num + "입니다.");
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age + "세 이군요~!!!");
		
		
	}

}
