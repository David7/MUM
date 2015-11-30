package homework;

public class lesson4_4 {
	public static int sumOfArray(int[] iArray, int iFrom, int iTo)
	{
		if(iFrom==iTo) return 0;
		return sumOfArray(iArray,iFrom+1,iArray.length)+iArray[iFrom];
	}
	public static void main(String[] args) {
		int[] iArray=new int[]{1,3,5,7};
		int iReturn=sumOfArray(iArray,0,iArray.length-1);
		System.out.print("Thes sum of the Array is:"+iReturn);
	}
}
