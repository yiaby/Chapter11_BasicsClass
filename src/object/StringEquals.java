package object;
/*
 * String과 Integer 클래스의 equals()메서드
 * 논리적으로 같은 인스턴스인지(메모리 주소가 다르더라도)판단.
 */
public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);           //두 인스턴스 주소 값이 같은지 비교하여 출력     =>false
		System.out.println(str1.equals(str2));		//String 클래스의 equals()메서드사용. 두 인스턴스의 문자열 값이 같은지 비교하여 출력	=>true
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);				//두 인스턴스 주소 값이 같은지 비교하여 출력	=>false
		System.out.println(i1.equals(i2));			//Integer 클래스의 equals()메서드 사용. 두인스터스의 정수 값이 같은지 비교하여 출력	=>true
	}

}
