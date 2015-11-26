package W1Homework;
import java.util.*;
public class lesson2_6 {

	public static void main(String[] args) 
	{
		Scanner mScanner=new Scanner(System.in);
		System.out.print("Please input a number:");
		int iNumber=mScanner.nextInt();
		for(int i=0;i<iNumber;i++)
		{
			for(int j=0;j<iNumber;j++)
			{
				System.out.print("* ");
			}
			if(i%2==0)
				System.out.print("\n ");
			else
				System.out.print("\n");
		}
	}
}
