package W1Homework;
import java.util.*;
public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] saOriginal={"horse", "dog", "cat", "horse","dog"};
		int iLength=saOriginal.length;
		String[] saOutput=new String[iLength];
		int iNew=0;
		boolean bEquals=false;
		saOutput[iNew]=saOriginal[0];
		for(int i=1;i<saOriginal.length;i++)
		{
			for(int j=0;j<saOutput.length;j++)
			{
				if(saOriginal[i].equals(saOutput[j]))
					{
						bEquals=true;
					}
			}
			if(!bEquals)
			{
				iNew++;
				saOutput[iNew]=saOriginal[i];
			}
		
		}
		System.out.print("[");
		for(int i=0;i<iNew+1;i++)
		{
			if (i<iNew) 
				System.out.print(saOutput[i]+",");
			else if (i==iNew) 
				System.out.print(saOutput[i]);
		}
		System.out.print("]");
	}
}
