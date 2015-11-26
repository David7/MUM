package W1Homework;
import java.util.*;
public class lesson2_2 {

	public static void main(String[] args) {
		Scanner mScanner=new Scanner(System.in);
		System.out.print("Input a year number: ");
		int iYear=mScanner.nextInt();
		boolean bLeapYear=false;
	
		//bLeapYear=iYear%4==0?true:false;
		bLeapYear=iYear%4==0?(iYear%100==0?(iYear%400==0?true:false):true):false;
		
		if(bLeapYear) 
			System.out.println("It's a Leap Year!");
		else 
			System.out.println("It's not a Leap Year!");
	}

}
