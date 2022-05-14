package String;
/*
 * String클래스의 final char[]변수 : 배열을 구현하지 않고도 String클래스로 문자열 사용
 *                               한번 선언된 문자열은 final로 선언 됨 => 변경 불가
 * concat()메서드: 두 문자열을 하나로 연결시키는 메서드      
 * => 둘 중 하나의 문자열이 변경되는 것이 아니라 두 문자열이 연결된 새로운 문자열이 생성됨
 *                        
 */
public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);                                                 //=>java
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));     //=>처음 문자열 주소 값: 366712642
		
		javaStr = javaStr.concat(androidStr); //문자열 javaStr와 문자열 androidStr를 연결하여 javaStr에 대입 
		
		System.out.println(javaStr);											     //=>javaandroid
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));   //=>연결된 문자열 주소 값: 1829164700
	}

}
