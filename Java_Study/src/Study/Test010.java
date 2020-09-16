package Study;

/*
�ܡܡ� �ڹ� �⺻ ���α׷��� �ܡܡ�

- ������ �ڷ���
- �ڹ��� �⺻ ����� : BufferedReader Ŭ���� 
*/



//System.in -> ����Ʈ �Է� �帧
//new BufferedReader(������(System.in))
//new BufferedReader(new InputStreamReader(System.in));

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test010 {

	public static void main(String[] args) throws IOException {
		
		// BufferedReaer �ν��Ͻ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ����
		int r;							// ������
		final double PI = 3.141592;		// ������
		double a, l;					// ����, �ѷ�
		
		// ���� �� ó��
		
		// 1. ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");
		
		// 2. ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r �� ��Ƴ���
		
		// BufferedReader �ȿ�... readLine() �޼ҵ�... �ܺ� �Է°� ��������
		// r = br.readLine();
		// r = "30"   -------------- (x)
		// r = parseInt()			 -- �Ű������� �Ѱܹ���
		//                              ���� ����� ���ڿ� �����͸� ���������� ��ȯ
		// r = Integer.parseInt();   -> Intger �� ����ִ� parseInt();
		// r = Integer.parseInt("30");
		
		r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt(br.readLine());
		
		// r = 30;
		
		// ����ڰ� �Է��� ���� BufferedReader(br) �� [ readLine() ]
		// �޼ҵ带 Ȱ���Ͽ� �о���� ��
		// �� ���� [ Integer.parseInt() ] �� ���� ������(������)���� ��ȯ�� ��
		// ���� ������ ������ ���� r �� ��Ƴ���
		
		// 3. ���� ���� �� �ѷ� ����
		a = r * r * PI;
		l = r * 2 * PI;
		
		// ��� ���
		
		/*
		 System.out.println(">> ���� : " + a);
		 System.out.println(">> �ѷ� : " + l);
		 */
		
		/*
		 System.out.printf(">> ���� : %.2f\n", a);
		 System.out.printf(">> �ѷ� : %.2f\n", l);
		 */
		
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", l);
		
		// [ %f ] �� �Ǽ����� �޾Ƴ��� �ɼ� ����
		// [ %.2f ] �� �Ҽ��� ���� �� ��° �ڸ����� ǥ���ϰڴٴ� �ǹ�
		// �� ��° �ڸ����� �ݿø�

	}

}
