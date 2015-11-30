package homework;

public class lesson4_2 {
	public static char minimumChar(String sMystr)
	{
		if(sMystr.length()==1) return sMystr.substring(0).charAt(0);
		if(sMystr.substring(0).charAt(0)< sMystr.substring(1).charAt(0))
		{
				sMystr=sMystr.charAt(0)+sMystr.substring(2);
				return minimumChar(sMystr);
		}
			sMystr=sMystr.substring(1);
			return minimumChar(sMystr);
	}
	public static void main(String[] args) {
		System.out.print(minimumChar("tkel"));
	}
}
