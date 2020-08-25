package randomEx;

import java.util.Random;

// # ´çÃ·º¹±Ç[1´Ü°è] 30%ÀÇ ´çÃ·È®·ü

public class RandomEx03 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(10);
		
		System.out.println(rNum);
		
		if(rNum < 3) {
			System.out.println("´çÃ·");
		}
		if(rNum >= 3) {
			System.out.println("²Î");
		}

	}

}
