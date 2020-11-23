package arrEx;

import java.util.Random;
import java.util.Scanner;

public class ColumnChart {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int n = scan.nextInt();			// ��� �� �б�
		int[] a = new int[n];			// �迭 ����
		
		for (int i = 0; i < n; i++) {
			a[i] = ran.nextInt(10) + 1;		// 1 ~ 10 ����
		}
		
		for (int i = 10; i >= 1; i--)
		{
			for (int j = 0; j < n; j++)
			{
				if (a[j] >= i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < 2 * n; i++)
		{
			System.out.print('-');
			
		}
		System.out.println();
		
		for (int i = 0; i < n; i++)
		{
			System.out.print(i%10 + " ");
			
		}
		
	}

}