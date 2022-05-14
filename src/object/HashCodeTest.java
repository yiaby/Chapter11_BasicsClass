package object;

public class HashCodeTest {
/*
 * String과 Integer클래스의 hashcode()메서드
 * 논리적으로 같은 인스턴스일 경우 같은 해시 테이블 주소를 반환함
 */
	
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//abc 문자열의 해시 코드 값 출력
		System.out.println(str1.hashCode());		//=> 96354
		System.out.println(str2.hashCode());		//=> 96354
		
		Integer i1 = new Integer(100);			
		Integer i2 = new Integer(100);
		
		//Integer(100) 의 해시 코드 값 출력
		System.out.println(i1.hashCode());			//=>100
		System.out.println(i2.hashCode());			//=>100
	}

}
