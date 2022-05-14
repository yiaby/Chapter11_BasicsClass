package classex;
/*
 * 리플렉션(reflection) : Class클래스를 활용하여 그 클래스의 정보를 가져오고, 
 * 이정보를 활용하여 인스턴스를 생성하거나 메서드를 호출하는 방식(잘 안쓰임)
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
//String 클래스 정보 가져오기
	public static void main(String[] args) throws ClassNotFoundException {
		
		//클래스 이름으로 가져오기
		Class strClass = Class.forName("java.lang.String");		
		
		//모든 생성자 가져오기
		Constructor[] cons = strClass.getConstructors();		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		//모든 멤버 변수(필드) 가져오기
		System.out.println();
		Field[] field = strClass.getFields();
		for(Field f : field) {
			System.out.println(f);
		}
		
		//모든 메서드 가져 오기
		System.out.println();
		Method[] method = strClass.getMethods();
		for(Method m : method) {
			System.out.println(m);
		}
		
	}

}
