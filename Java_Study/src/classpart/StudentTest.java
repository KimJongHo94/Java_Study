package classpart;

public class StudentTest {
	public static void main(String[] args) {
		
		// new 키워드를 사용하여 생성자로 생성
		Student studentLee = new Student();
		
		// 클래스의 속성, 메서드 참조하기
		// 생성에 사용한 변수(참조변수)로 클래스의 속성, 메서드 참조
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}

}
