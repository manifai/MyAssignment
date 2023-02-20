package week3.day1.w3d1assignment;

public class AxisBank extends BankInfo {

	public void deposit(int x) {
		System.out.println("AxisBank deposit amt : "+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank objBank=new AxisBank();
		objBank.deposit(5000);
		objBank.fixed(10000);
		objBank.saving(500000);
	}
}
