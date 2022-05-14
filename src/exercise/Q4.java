package exercise;

class MyDog{
	String name;
	String type;
	
	MyDog(String name, String type){
		this.type = type;
		this.name = name;
	}
	
	public String toString() {
		return type + " " + name;
		
	}
}


public class Q4 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이","진돗개");
		System.out.println(dog);
	}

}
