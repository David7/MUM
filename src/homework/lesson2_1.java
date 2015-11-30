package homework;
import java.util.*;

public class lesson2_1 {

	public static void main(String[] args) {
		Scanner mSanner= new Scanner(System.in);
		System.out.print("Enter an amount:");
		double fNumber=mSanner.nextFloat();
		System.out.printf("%d dollars\n",(int)fNumber);
		System.out.printf("%d quarters\n",(int)((fNumber-(int)fNumber)/0.25));
		double fDime=fNumber-(int)fNumber-0.25*(int)((fNumber-(int)fNumber)/0.25);
		System.out.printf("%d dimes\n",(int)(fDime/0.10));
		double fNickel=fDime-0.1*(int)(fDime/0.10);
		System.out.printf("%d nickels\n",(int)(fNickel/0.05));
		double fPennie=fNickel-0.05*(int)(fNickel/0.05);
		System.out.printf("%d pennies\n",(int)(fPennie/0.01));
	}

}
