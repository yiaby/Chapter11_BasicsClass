package object;
class Book{
	int bookNumber;
	String bookTitle;

	//책 번호와 제목을 매개변수로 입력받는 생성자
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}	
	
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] arges) {
		Book book1 = new Book(200,"개미");
		
		System.out.println(book1);					//-->인스턴스 정보(클래스 이름 , 주소 값)
		System.out.println(book1.toString()); 		//-->toString()메서드로 인스턴스 정보(클래스 이름, 주소 값)을 보여줌
	
		/*System.out.println(); ===> 자동으로 toString()메서드 호출됨
		  toString()메서드 원형          ===> getClass().getName() + '@' + Integer.toHexString(hashCode))		
		*/
	}

	
}
