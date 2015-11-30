package homework;

public class lesson4_3 {
	static int binarySearch(int[] iaSortedArray,int iFrom, int iTo, int iSearchedElement)
	{
		if(iaSortedArray[iTo]==iSearchedElement ) return iTo;
		if(iFrom==iTo-1 && iaSortedArray[iTo]!=iSearchedElement && iaSortedArray[iFrom]!=iSearchedElement) return -1;
		
		int iMiddle=(iFrom+iTo)/2;
		
		if(iSearchedElement>iaSortedArray[iMiddle])
		{
			return binarySearch(iaSortedArray,iMiddle,iTo,iSearchedElement);
		}
		else
		{
			return binarySearch(iaSortedArray,iFrom,iMiddle,iSearchedElement);
		}
		
	}
	public static void main(String[] args) {
		int[] iaSortedArray={0,1,3,4,6,7,9,12,13,24,25,56,77,109};
		int iPosition=binarySearch(iaSortedArray,0,iaSortedArray.length-1,77);
		if(iPosition>=0)
			System.out.println("Find it at: "+iPosition);
		else
			System.out.print("Not Found");
		
		iPosition=binarySearch(iaSortedArray,0,iaSortedArray.length-1,770);
		if(iPosition>=0)
			System.out.println("Find it at: "+iPosition);
		else
			System.out.print("Not Found");
	}
}
