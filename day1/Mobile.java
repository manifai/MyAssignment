package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel="Mi5";
		float mobileWeight=180.55f;
		System.out.println("Mobile Model :"+mobileModel);
		System.out.println("Weight of the Mobile :"+mobileWeight+"g");
	}
	
	public void sendSms() {
		boolean isFullCharged=true;
		int mobileCost=15000;
		System.out.println("is mobile full charged :"+ isFullCharged);
		System.out.println("Cost of the mobile :"+mobileCost);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile call=new Mobile();
		System.out.println("This is my mobile");
		call.makeCall();
		call.sendSms();
		
		

	}

}
