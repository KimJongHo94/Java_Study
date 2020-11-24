/*

	컬렉션 프레임워크(Collection Framework)

*/

// Set → HashSet, TreeSet
// - 순서 없음
// - 중복을 허용하지 않는 구조(기본)

/*

○ TreeSet<E> 클래스

  java.util.TreeSet<E> 클래스는
  Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
  데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.

*/

// VO	→ Value Object
// DAO  → Data Asscess Object     ------
//                                     | 우리 눈 높이에서 같은 개념
// DTO  → Data Transfer Object    ------

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeDTO		// GradeVO
{

	// 주요 속성 구성
	private String hak;			// 학번
	private String name;		// 이름
	private int kor, eng, mat;	// 국어, 영어, 수학 점수

	// 생성자(사용자 정의 생성자 → 5개의 매개변수를 가진 생성자)
	GradeDTO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 생성자(사용자 정의 생성자 → 매개변수 없는 생성자)
	// -- 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	GradeDTO()
	{

	}

	// getter / setter 구성
	String getHak()
	{
		return hak;	
	}

	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getName()
	{
		return name;
	}

	void setName(String name)
	{
		this.name = name;
	}
	
	int getKor()
	{
		return kor;
	}

	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getEng()
	{
		return eng;
	}

	void setEng(int eng)
	{
		this.eng = eng;
	}

	int getMat()
	{
		return mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}

	// 추가 메소드 정의(총점 산출)
	int getTot()
	{
		return kor + eng + mat;
	}

}

class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeDTO s1 = (GradeDTO)o1;
		GradeDTO s2 = (GradeDTO)o2;

		// 총점 기준(오름차순)
		// return s1.getTot() - s2.getTot();

		// 총점 기준(내림차순)
		// return s2.getTot() - s1.getTot();

		// 학번 기준(오름차순)
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//                      "2000883"					   "2000824"
		// return 2000883 - 2000824
		// return 59;

		// 학번 기준(내림차순)
		// return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		// 이름 기준(오름차순)
		//return 정수형;
		// return s1.getName().compareTo(s2.getName());

		// 이름 기준(내림차순)
		return s2.getName().compareTo(s1.getName());
	}
}

public class Test174 {

	public static void main(String[] args) {

		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet 자료구조 set 에 요소 추가  → add();
		set.add("원피스");
		set.add("나루토");
		set.add("강철의연금술사");
		set.add("진격의거인");
		set.add("귀면의칼날");
		set.add("이웃집토토로");
		set.add("하이큐");
		set.add("슈가슈가룬");
		set.add("아따맘마");

		// set 요소 전체 출력 → Iterator 활용
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//--==>> 강철의연금술사 귀면의칼날 나루토 슈가슈가룬 아따맘마 원피스 이웃집토토로 진격의거인 하이큐
		// 오름차순 정렬

		// TreeSet 자료구조 인스턴스 생성
		TreeSet<GradeDTO> set2 = new TreeSet<GradeDTO>(new MyComparator<GradeDTO>());

		// GradeDTO dto1 = new GradeDTO("2000883", "아무무", 90, 80, 70);

		// set2.add(dto1);
		set2.add(new GradeDTO("2000883", "아무무", 90, 80, 70));
		set2.add(new GradeDTO("2000824", "나서스", 91, 81, 71));
		set2.add(new GradeDTO("2000831", "볼베베", 98, 78, 88));
		set2.add(new GradeDTO("2000816", "자르반", 62, 49, 99));
		set2.add(new GradeDTO("2000835", "신짜오", 96, 31, 90));
		// ==> 정렬이랑 적재가 끝난 상황

		// Iterator 를 활용한 set 요소 전체 출력
		/*
		Iterator<GradeDTO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		*/

		Iterator<GradeDTO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			GradeDTO dto = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n", dto.getHak(), dto.getName(), dto.getKor(), dto.getEng(), dto.getMat(), dto.getTot());
		}
		System.out.println();
		/*

			// 오름차순
			2000816     자르반   62   49   99    210
			2000835     신짜오   96   31   90    217
			2000883     아무무   90   80   70    240
			2000824     나서스   91   81   71    243
			2000831     볼베베   98   78   88    264

			// 내림차순
			2000831     볼베베   98   78   88    264
			2000824     나서스   91   81   71    243
			2000883     아무무   90   80   70    240
			2000835     신짜오   96   31   90    217
			2000816     자르반   62   49   99    210

			// 학번 기준(오름차순)
			2000816     자르반   62   49   99    210
			2000824     나서스   91   81   71    243
			2000831     볼베베   98   78   88    264
			2000835     신짜오   96   31   90    217
			2000883     아무무   90   80   70    240

			// 학번 기준(내림차순)
			2000883     아무무   90   80   70    240
			2000835     신짜오   96   31   90    217
			2000831     볼베베   98   78   88    264
			2000824     나서스   91   81   71    243
			2000816     자르반   62   49   99    210

			// 이름 기준(오름차순)
			2000824     나서스   91   81   71    243
			2000831     볼베베   98   78   88    264
			2000835     신짜오   96   31   90    217
			2000883     아무무   90   80   70    240
			2000816     자르반   62   49   99    210

			// 이름 기준(내림차순)
			2000816     자르반   62   49   99    210
			2000883     아무무   90   80   70    240
			2000835     신짜오   96   31   90    217
			2000831     볼베베   98   78   88    264
			2000824     나서스   91   81   71    243

		*/

	}

}