package review;

import java.util.Scanner;

public class InputEx00 {

	public static void main(String[] args) {
		
		/*
		   # �Է¹ޱ�
		   
		   1. import java.util.Scanner; // ��Ű�� �� �ؿ� �ۼ��Ѵ�.
		   
		   2. Scanner scan = new Scanner(System.in);	
		   
		   3. �ȳ��� �ۼ�
		      System.out.print("���̸� �Է��ϼ��� : ");
		      
		   4. �Է¹ޱ�
		      int age = scan.nextInt();
		      
		   5. ������
		      System.out.println("����� ���̴� " + age + "�� �̱���!");
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� " + num + "�Դϴ�.");
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		System.out.println("����� ���̴� " + age + "�� �̱���~!!!");
		
		
	}

}
