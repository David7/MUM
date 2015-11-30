package homework;
import java.util.*;
public class lesson2_7 {

	public static void main(String[] args) {
		Scanner mScanner=new Scanner(System.in);
		System.out.print("Input people's weight in lbs:");
		int iWeight=mScanner.nextInt();
		
		System.out.print("Choose Planet (1..6 Venus,Mars,Jupiter,Saturn,Uranus,Neptune): ");
		int iPlanet=mScanner.nextInt();
		
		switch(iPlanet)
		{
			case 1:
				System.out.println("The weight is: " + iWeight*0.78 );
				break;
			case 2:
				System.out.println("The weight is: " + iWeight*0.39 );
				break;
			case 3:
				System.out.println("The weight is: " + iWeight*2.65 );
				break;
			case 4:
				System.out.println("The weight is: " + iWeight*1.17 );
				break;
			case 5:
				System.out.println("The weight is: " + iWeight*1.05 );
				break;
			case 6:
				System.out.println("The weight is: " + iWeight*1.23 );
				break;
			default:
				System.out.println("Please input 1..6 for different planet! " );
				break;
		}
	}
}
