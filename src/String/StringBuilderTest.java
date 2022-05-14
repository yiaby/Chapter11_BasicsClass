package String;
/*
 * String : 한 번 생성한 문자열은 변경 불가
 * StringBuffer,StringBuilder : 내부 변경이 가능한 char[]변수를 가지고 있음 
 * => 문자열을 연결하거나 변경할때 두 클래스를 사용함
 * 
 * [StringBuffer과 StringBuilder의 차이점]
 * =>여러 작업(스레드)이 동시에 문자열을 변경하려 할 때 '문자열이 안전하게 변경되도록 보장해주는가'의 차이
 * 
 * 안전 보장 : StringBuffer 
 * 안전 보장 되지 않음 : StringBuilder
 * 
 * 멀티 스레드가 아닐경우에는 StringBuilder를 사용하는 것이 실행 속도가 좀 더 빠름
 */

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소 :" + System.identityHashCode(javaStr));           //인스턴스가 처음 생성되었을 때 메모리 주소 :366712642

		StringBuilder buffer = new StringBuilder(javaStr);                                    //String으로 부터 StringBuilder생성
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));       //연산 전 buffer 메모리 주소 : 1829164700

		//문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));        //연산 후 buffer 메모리 주소: 1829164700

		//String클래스로 변환
		javaStr = buffer.toString();  
		System.out.println(javaStr);                                                          //java and android programming is fun!!
		System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr)); //새로 만들어진 javaStr 문자열 주소 : 2018699554

	}

}
