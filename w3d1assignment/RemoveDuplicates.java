package week3.day1.w3d1assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("with duplicate words: "+text);
		String [] text1=text.split(" ");
		for(int i=0;i<text1.length;i++) {
			int count=1;
			for(int j=i+1;j<text1.length;j++) {
				if(text1[i].equals(text1[j])) {
					count+=1;
					text1[j]="";
				} 
				
			}
		}
		System.out.print("without duplicate words : ");
		for(String a:text1) {
		
			System.out.print(a+" ");
	}
	}

}
