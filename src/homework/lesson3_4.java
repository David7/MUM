package homework;

class SavingsAccount {
	static double annualInterestRate=0.04;
	double savingsBalance;
	public void calculateMonthlyInterest()
	{
		for(int i=0;i<12;i++)
		{
			savingsBalance=savingsBalance*(1+annualInterestRate/12);
			System.out.printf("The %2d month  Savings Balance is %.2f\n",i+1,savingsBalance);
		}
	}
	public SavingsAccount(double dSavingsBalance) {
		savingsBalance=dSavingsBalance;
	}
	public static void voidmodifyInterestRate(double newInterestRate)
	{
		annualInterestRate=newInterestRate;
	}
}
public class lesson3_4 {

	public static void main(String[] args) {
		SavingsAccount saver1=new SavingsAccount(2000.00);
		SavingsAccount saver2=new SavingsAccount(3000.00);
		System.out.println("saver1's monthly saving balance:");
		saver1.calculateMonthlyInterest();
		System.out.println("\nsaver2's monthly saving balance:");
		saver2.calculateMonthlyInterest();
		System.out.println("\n");
		
		saver1.voidmodifyInterestRate(0.05);
		System.out.printf("saver1's next month's saving Balance (after interest raise) is: %.2f\n" , 
		    saver1.savingsBalance*(1+saver1.annualInterestRate/12));
		System.out.printf("saver2's next month's saving Balance (after interest raise) is: %.2f\n" , 
			    saver2.savingsBalance*(1+saver2.annualInterestRate/12));
	}
}
