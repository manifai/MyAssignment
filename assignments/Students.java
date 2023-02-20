package week3.day1.assignments;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Students Id: "+ id);
		System.out.println(" ");
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("Students Id: "+ id);
		System.out.println("Students Name: "+ name);
		System.out.println(" ");
	}
	
	public void getStudentInfo(String email,long phone) {
		System.out.println("Students Id: "+ email);
		System.out.println("Students phone Number : "+ phone);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students ObjStu=new Students();
		ObjStu.getStudentInfo(101);
		ObjStu.getStudentInfo(102, "Manikandan");
		ObjStu.getStudentInfo("Manikandan@gmail.com", 7708949409l);

	}

}
