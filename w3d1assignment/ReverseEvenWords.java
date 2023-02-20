package week3.day1.w3d1assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String [] test1=test.split(" ");
		System.out.println("Actual Sentance : "+test);
		System.out.print("After Reverse Even Words : ");
		for(int i=0;i<test1.length;i++) {
			if(i%2!=0) {
				for(int j=test1[i].length()-1;j>=0;j--) {
					System.out.print(test1[i].charAt(j));
				}
				System.out.print(" ");	
				
			}
			else {
				System.out.print(test1[i]+" ");
			}
			
		}
	}	
	
}
