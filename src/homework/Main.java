package homework;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		int iCount=0;
		while(true)
		{
			// Create two object for the PairOfDice
			// Roll the two pairs of dice for both objects until the totals are same.
			PairOfDice mPairOfDice1=new PairOfDice();
			PairOfDice mPairOfDice2=new PairOfDice();
			System.out.println("the Total of PairOfDice1 is: "+(mPairOfDice1.die1+mPairOfDice1.die2)+", the Total of PairOfDice2 is: "+(mPairOfDice2.die1+mPairOfDice2.die2));
			iCount++;
			if((mPairOfDice1.die1+mPairOfDice1.die2)==(mPairOfDice2.die1+mPairOfDice2.die2))
				break;
		}
			
      // Display how many times needed to get the same total
		System.out.printf("All together it takes %d times to get same total!",iCount);
	}
}	
class PairOfDice {
	public int die1; // Number showing on the first die.
	public int die2; // Number showing on the second die.

	public PairOfDice() {
		// Constructor. Rolls the dice, so that they initially
		// show some random values. Call the roll() method to roll the dice.
		roll();
	}

	public PairOfDice(int val1, int val2) {
		// Constructor. Creates a pair of dice that
		// are initially showing the values val1 and val2.
		die1=val1;
		die2=val2;
	}

	public void roll() {
		Random myRandom=new Random();
		int iRandom=myRandom.nextInt(6);
		this.die1=iRandom+1;
		iRandom=myRandom.nextInt(6);
		this.die2=iRandom+1;
	}
}
	