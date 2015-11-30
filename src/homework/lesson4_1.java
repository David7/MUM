package homework;
public class lesson4_1 {

	public static void main(String[] args) {
		String str1="ace";
		String str2="bdf";
		System.out.print(mergeStr(str1,str2));
	}
	public static String mergeStr(String str1, String str2)
	{
		if(str1.length()==0 || str2.length()==0) 
			return str1+str2;
		
		if(str1.charAt(0)<str2.charAt(0))
		{
			return str1.charAt(0)+ mergeStr(str1.substring(1), str2);
		}
		else
		{
			return str2.charAt(0)+ mergeStr(str1, str2.substring(1));
		}
	}
}
