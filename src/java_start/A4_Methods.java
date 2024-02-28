package java_start;

public class A4_Methods {
	
	public int getMarks(String studentName){
		int marks = 0;
		switch (studentName) {
		case "abhi":
			marks = 90;
			break;
		case "shubh":
			marks = 80;
			break;
		case "jais":
			marks = 99;
			break;

		default:
			marks = -1;
			break;
		}
		return marks;
	}
	public static void main(String[] args){
		A4_Methods m1 = new A4_Methods();
		int abhi_marks = m1.getMarks("abhi");
		System.out.println(abhi_marks);
	}
	

}
