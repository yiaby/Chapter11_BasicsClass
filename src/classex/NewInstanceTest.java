package classex;
//newInstance()를 사용하여 Person클래스의 인스턴스 생성하기

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();		//=>생성자로 Person인스턴스 생성하기
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person)pClass.newInstance(); //=>Class클래스의 newInstace()메서드로 Person인스턴스 생성하기
		System.out.println(person2);				   //newInstace()의 반환값은 Object, Object형에서 Person형으로 다운 캐스팅
	}
	/*
	 * [Class.forName()을 사용한 동적 로딩]
	 * 
	 * 대부분의 클래스 정보는 프로그램이 로딩될 때 이미 메모리에 있음
	 * 
	 * 그러나, 프로그램 실행 이후에 클래스 로딩이 필요한 경우
	 * (예: 오라클, MySQL등 여러 데이터 베이스를 연동할수 있는 시스템이 있다고 할 때
	 *     컴파일할 때 모든 데이터 베이스를 같이 컴파일 하는것이 아니라, 필요한 데이터 베이스만 컴파일 하는 경우)
	 *  
	 * String className = "classex.Person"
	 * Class pclass = Class.forName(className);
	 * 
	 * 위 처럼 className변수에 다른 문자열을 대입하면 필요에 따라 클래스를 동적으로 변경할 수 있음.
	 * 
	 * 주의사항 : 클래스 이름 문자열에 오류가 발생해도 ClassNotFoundException예외가 발생함으로 그 오류를 알 수 없음. 
	 */
}
