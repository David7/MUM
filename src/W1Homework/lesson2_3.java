package W1Homework;
import java.util.*;

public class lesson2_3 {

	public static void main(String[] args) {
		Scanner mScanner=new Scanner(System.in);
		System.out.print("Input A palindrome number:(like abcba): ");
		int iPalindrome=mScanner.nextInt();
		if(iPalindrome/10000<1)
		{
			System.out.print("The number should be 5 digits, try again:");
			iPalindrome=mScanner.nextInt();
		}
		
		Integer inPalindrome=iPalindrome;
		String sPalindrome=inPalindrome.toString();
		
		if(sPalindrome.charAt(0)==sPalindrome.charAt(4) && sPalindrome.charAt(1)==sPalindrome.charAt(3))
			System.out.println("It's a Palindrome!");
		else
			System.out.println("It's not a Palindrome!");
	}
}
