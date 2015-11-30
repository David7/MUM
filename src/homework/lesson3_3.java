package homework;

class Billing {
	final double tax=0.08;
	public double computeBill(double dPrice) {
		return dPrice*(1+tax);
	}
	public double computeBill(double dPrice, int quantity) {
		return dPrice*quantity*(1+tax);
	}
	public double computeBill(double dPrice, int quantity,int coupon) {
		return dPrice*quantity*(100-coupon)/100*(1+tax);
	}
}

public class lesson3_3 {
	public static void main(String[] args) {
		Billing myBilling=new Billing();
		double dPrice=45.99;
		int iQuantity=20;
		int iCoupon=10;
		
		System.out.printf("The Book with prince %.2f cost (after tax): %.2f\n", 
				dPrice,myBilling.computeBill(dPrice));
		System.out.printf("%d Books with prince %.2f cost (after tax): %.2f\n", 
				iQuantity,dPrice,myBilling.computeBill(dPrice,iQuantity));
		System.out.printf("%d Books with prince %.2f and %d discount cost  (after tax): %.2f\n", 
				iQuantity,dPrice,iCoupon,myBilling.computeBill(dPrice,iQuantity,iCoupon));
	}
}
