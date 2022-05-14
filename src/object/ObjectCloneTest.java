package object;
/*
 * clone():클래스의 인스턴스를 새로 복제하여 생성해줌
 * 다른 메모리 주소에 멤버변수가 동일한 인스턴스를 생성
 * 
 * Cloneable인스턴스: 복제할 대상 클래스뒤에 선언하는 인스턴스
 * 별도로 구현해야하는 메서드는 없음. => 마커 인터페이스(marker interface)
 */

//원점을 의미함는 Point클래스
class Point{
	int x;
	int y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x = " + x + "," + "y = " + y;
	}
}

class Circle implements Cloneable{ //Cloneable : 객체를 복제해도 된다는 의미로  Cloneable인터페이스를 함께 선언
	Point point;
	int radius;
	
	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x , y);
	}
	public String toString() {
		return "원점은 " + point + "이고 , " + "반지름은 " + radius + "입니다.";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException { 
		//throws CloneNotSupportedException : clone()메서드를 사용할 때 발생할 수 있는 오류를 예외 처리함
		return super.clone();
	}
}
public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();		//clone()메서드를 사용해 circle 인스턴스를 copyCircle에 복제함
		
		System.out.println(circle);			//=>원점은 x = 10,y = 20이고 , 반지름은 30입니다.
		System.out.println(copyCircle);		//=>원점은 x = 10,y = 20이고 , 반지름은 30입니다.
		System.out.println(System.identityHashCode(circle));		//=>366712642
		System.out.println(System.identityHashCode(copyCircle));    //=>1829164700
		
	}

}
