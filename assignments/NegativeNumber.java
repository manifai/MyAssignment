package week1.day1.assignments;

public class NegativeNumber {
	
	public void negative(int a) {
		if (a<0) {
			
			int b=a*-1;
			System.out.println("The number "+a+" is convert to "+b);
		}
		else {
			System.out.println("by default given number "+a+" is positive");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NegativeNumber neg=new NegativeNumber();
		neg.negative(-40);
		

	}

}
