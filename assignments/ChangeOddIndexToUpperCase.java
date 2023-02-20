package week3.day1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] a=test.toCharArray();
		System.out.println("ChangeOddIndexToUpperCase  : ");
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				System.out.print(Character.toUpperCase(a[i]));
			}
			else {
				System.out.print(a[i]);
			}
		}

	}

}
