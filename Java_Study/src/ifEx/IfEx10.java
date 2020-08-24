package ifEx;

// # 변수의 생명주기(Scope)

public class IfEx10 {

	public static void main(String[] args) {
		
		int x = 10;
		
		if(true) {
			System.out.println("x = " + x);
			
			int y = 20;
		}
		
		// System.out.println("y = " + y);
		// 컴파일 에러 발생 
		// if문 안에서 선언한 변수는 if문 밖에서 사용 불가

	}

}
