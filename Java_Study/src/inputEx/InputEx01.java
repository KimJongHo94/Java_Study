package inputEx;

import java.util.Scanner;

/*
 * # �Է¹ޱ�
 * 1. import java.util.Scanner;
 *    java.util ��Ű�� ���� Scanner Ŭ���� ������
 *    ���� �������� �ҷ��´�.
 * 2. scan ���� ����
 * 	  Scanner scan = new Scanner(System.in);
 * 3. �ȳ��� �ۼ�
 *    System.out.print("���̸� �Է��ϼ��� : ");
 * 4. �Է¹ޱ�
 *    int age = scan.nextInt();
 */

public class InputEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� : " + num + "�Դϴ�.");
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		System.out.println("����� ���̴� " + age + "�� �̱���!");

	}

}
