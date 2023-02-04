package week1.day1;

public class Student {
	
	String studentName="Manikandan";
	int rollNo=0123;
	String collegeName="Jairam";
	int markScored=480;
	float cgpa=9.50f;
	
	public void Report() {
		System.out.println("Student Name :"+studentName);
		System.out.println("Roll No :"+rollNo);
		System.out.println("College :"+collegeName);
		System.out.println("Total Mark :"+markScored);
		System.out.println("CGPA :"+cgpa);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		stu.Report();

	}

}
