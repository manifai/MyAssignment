package week1.day1.assignments;


public class PrimeNumber {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * What are my learnings from this code? 
		 * 1.if condition 
		 * 2.for loop 
		 * 3.break statement
		 */
		int num=33;
		int n=num/2;
		boolean test=true;
		if(num>1) {
			for(int i=2;i<=n;i++) {
				if(num%i==0) {
					test=false;
					break;
				}
			}
			if(test==true) {
				System.out.println(num + " is a prime number");
			}
			else {
				System.out.println(num + " is not a prime number");
			}
		}
		else {
			System.out.println("prime number should be above 1");
		}

	}

}
