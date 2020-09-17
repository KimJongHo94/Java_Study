package Study;

/*
●●● 자바 기본 프로그래밍 ●●●

- 변수와 자료형
- 자바의 기본 입출력 : BufferedReader 클래스
*/

//사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
//이름과 총점을 출력하는 프로그램을 구현한다.

//실행 예)
//이름을 입력하세요 : 
//국어 점수 입력 : 
//영어 점수 입력 :
//수학 점수 입력 :
//
//=== 결과 ===
//이름 : 아무개
//총점 : 240
//계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012 {

	public static void main(String[] args) throws IOException {
		
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수 선언
		String name;
		int kor, eng, math;
		double tot;
		
		// 연산 및 처리
		System.out.print("이름 입력 : ");
		name = br.readLine();
		
		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 입력 : ");
		math = Integer.parseInt(br.readLine());
		
		tot = kor + eng + math;
		
		System.out.println();
		
		// 결과 출력
		
		/*
		System.out.println("=== 결과  ===");
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
		*/
		
		System.out.println("=== 결과 ===");
		System.out.printf("이름 : %s\n총점 : %.2f\n", name, tot);
		
		/*
		// 주요 변수 선언(헝가리)
		String strName;           -> 이름 변수
		int nKor, nEng, nMat      -> 국어, 영어, 수학 점수 변수
		int nTot;                 -> 총점 변수

		// 추가 변수 선언
		String strTemp;           -> 문자열 데이터를 임시로 저장할 변수
		

		// 연산 및 처리
		// 1. 사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름 입력 : ");
		
		// 2. 사용자가 입력한 값(외부 데이터)를 변수에 담아내기
		strName = br.readLine();

		// 3. 사용자에게 안내 메세지 출력 -> 국어점수 입력 안내
		System.out.print("국어 점수 입력 : ");

		// 4. 사용자가 입력한 값을 정수 형태로 변환한 후 nKor 변수에 담아내기
		strTemp = br.readLine();
		nKor = Integer.parseInt(strTemp);

		// 5. 사용자에게 안내 메세지 출력 -> 영어점수 입력 안내
		System.out.print("영어 점수 입력 : ");

		// 6. 사용자가 입력한 값을 정수 형태로 변환한 후 nEng 변수에 담아내기
		strTemp = br.readLine();
		nEng = Integer.parseInt(strTemp);

		// 7. 사용자에게 안내 메세지 출력 -> 수학점수 입력 안내
		System.out.print("수학 점수 입력 : ");

		// 8. 사용자가 입력한 값을 정수 형태로 변환한 후 nMat 변수에 담아내기
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);

		// 9. 각 점수 변수에 담겨있는 데이터(입력 데이터)들을
		//    종합하여 덧셈 연산을 수행하는 과정을 거쳐 총점을 산출하고
		//    그 결과를 총점 변수에 담아내기
		nTot = nKor + nEng + nMat;



		// 결과 출력

		// 개행 방법
		// 1. System.out.println();
		// 2. System.out.println("\n===[결과]===");

		System.out.println("=== 결 과 ===");
		// System.out.println("이름 : " + strName);
		// System.out.printf("이름 : %s\n", strName

		// System.out.println("총 점 : " + nTot);
		// System.out.printf("총 점 : %d\n", nTot);
		

	*/

	}

}
