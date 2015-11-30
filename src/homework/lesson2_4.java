package homework;
import java.util.*;

public class lesson2_4 {

	public static void main(String[] args) {
		Scanner mScanner=new Scanner(System.in);
		System.out.print("Please input Full name:");
		String sFirstName=mScanner.next();
		String sLastName=mScanner.next();
		int iRandom=(int)(Math.random()*100000);
		iRandom=iRandom/100;
				
		if(iRandom<10)
			System.out.printf("The Final String is: "+ sFirstName.charAt(0)+sLastName.substring(0,5)+"00"+iRandom);
		else if(iRandom<100)
			System.out.printf("The Final String is: "+ sFirstName.charAt(0)+sLastName.substring(0,5)+"0"+iRandom);	
		else 
			System.out.printf("The Final String is: "+ sFirstName.charAt(0)+sLastName.substring(0,5)+iRandom);	
	}
}
