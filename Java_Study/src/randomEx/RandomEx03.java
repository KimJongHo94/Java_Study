package randomEx;

import java.util.Random;

// # ��÷����[1�ܰ�] 30%�� ��÷Ȯ��

public class RandomEx03 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(10);
		
		System.out.println(rNum);
		
		if(rNum < 3) {
			System.out.println("��÷");
		}
		if(rNum >= 3) {
			System.out.println("��");
		}

	}

}
