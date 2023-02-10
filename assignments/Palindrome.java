package week1.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=343;
		int tempnum=0;
		int rem;
		for(int num=number;num>0;num/=10) {
			rem=num%10;
			tempnum=(tempnum*10)+rem;
		}
		if(number==tempnum) {
			System.out.println(number+" is a palindrome number");
		}
		else {
			System.out.println(number+" is not a palindrome number");
		}
		
		

	}

}
