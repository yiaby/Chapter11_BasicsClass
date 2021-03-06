package object;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentId = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId + "," + studentName;
	}

	@Override //equals() 메서드 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Student) {	          //==> equals()메서드의 매개변수는 Object형,매개변수의 원래 인스턴스형이 Student형인지를 확인
			Student std = (Student)obj; 	      //==> obj를 Object클래스에서 Student클래스로 다운캐스팅(명시적 형변환)
			if(this.studentId == std.studentId)   //==>this 학번과 std의 학번이 같은지 판단
				return true;
			else return false;
			}
		return false;
		}
		
	@Override //해시 코드 값으로 학번을 반환 하도록 메서드 재정의
	public int hashCode() {
		return studentId;
	}
}
	


public class EqualsTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100,"이상원");
		Student studentLee2 = studentLee;	//주소 복사
		Student studentSang = new Student(100,"이상원");
		
		System.out.println("=========equals()==========");
		
		//동일한 주소의 두 인스턴스 비교
		if(studentLee == studentLee2) 
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2)) //equals로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		//동일인이지만 인스턴스의 주소가 다른 경우
		if(studentLee == studentSang) 
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else 
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang)) //equals로 비교
			System.out.println("studentLee와 studentSang는 동일합니다.");
		else
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		
		System.out.println();
		
		System.out.println("=========hashCode()==========");
		//두 학생의 해시코드 값
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());					//=>100
		System.out.println("studentSang의 hashCode : " + studentLee.hashCode());					//=>100
		//두 학생의 실제 주소값
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));		//=>366712642
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));	//=>1829164700
		
		// studentLee와 studentSang은 논리적으로는 같지만, 실제로는 다른 인스턴스
		
		
		
		
	}

}
