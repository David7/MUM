package homework;

public class lesson4_5 {
	public static boolean isPalindrome(String sMyString)
	{
		if(sMyString.length()==1) return true;
		char c1=sMyString.charAt(0);
		char c2=sMyString.charAt(sMyString.length()-1);
		if(c1==c2)
		{
			String newString=sMyString.substring(1,sMyString.length()-1);
			return isPalindrome(newString);
		}
		else return false;
	}
	public static void main(String[] args) {
		String sMyString="23532";
		if(isPalindrome(sMyString)) 
			System.out.println(sMyString+" is a Palindrome!");
		else
			System.out.println(sMyString+" is not a Palindrome!");
		
		sMyString="23523";
		if(isPalindrome(sMyString)) 
			System.out.println(sMyString+" is a Palindrome!");
		else
			System.out.println(sMyString+" is not a Palindrome!");
	}
}
