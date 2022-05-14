package classex;
/*
 * Class 클래스: 클래스의 정보를 직접 찾아야할때 Class클래스를 활용
 * 
 * [Class 클래스로 클래스의 정보를 가져오는 방법]
 * 		1.Object클래스의 getClass()메서드 활용하기 : 모든 메서드가 사용 가능. 단, 이미 생성된 메서드가 있어야 함
 * 		2.클래스 파일 이름을 Class 변수에 직접 대입
 * 		3.Class.forName("클래스 이름")메서드 사용 하기
 * 		(2,3번은 클래스 이름만으로 Class클래스를 반환 받음)
 */

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//throws ClassNotFoundException : forName()메서드에서 발생하는 예외를 처리함. 이름과 일치하는 클래스가 없는 경우 ClassNotFoundException발생 
		Person person = new Person();
		
		//1. Object의 getClass()메서드 사용하기
		Class pClass1 = person.getClass();  
		System.out.println(pClass1.getName());
		
		//2. 직접 class 파일 대입하기
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		//3.클래스 이름 가져오기
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		//1~3 결과 : classex.Person
	}

}
