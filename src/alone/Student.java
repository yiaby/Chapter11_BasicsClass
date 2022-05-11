package alone;

public class Student {
	String studentName;
	int studentNum;
	
	Student(String studentName,int studentNum){
		this.studentName = studentName;
		this.studentNum = studentNum;
	}

	@Override
	public String toString() {
		return studentName + ','+studentNum;
	}
}
