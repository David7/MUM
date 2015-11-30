package homework;
import java.util.*;
public class lesson2ExtraCredit {

	public static void main(String[] args) {
		Scanner mScanner=new Scanner(System.in);
		System.out.print("Input an four-digit Interger:");
		int iNumber=mScanner.nextInt();
		int[] iaOriginalNumber=new int[4];
		int[] iaNewNumber=new int[4];
		iaOriginalNumber[0]=iNumber/1000;
		iaOriginalNumber[1]=(iNumber-1000*iaOriginalNumber[0])/100;
		iaOriginalNumber[2]=(iNumber-1000*iaOriginalNumber[0]-100*iaOriginalNumber[1])/10;
		iaOriginalNumber[3]=iNumber-1000*iaOriginalNumber[0]-100*iaOriginalNumber[1]-10*iaOriginalNumber[2];
		
		for(int i=0;i<4;i++) 
		{
			iaNewNumber[i]=(iaOriginalNumber[i]+7)%10;
		}
		int iTemp=iaNewNumber[0];
		iaNewNumber[0]=iaNewNumber[2];
		iaNewNumber[2]=iTemp;
		
		iTemp=iaNewNumber[1];
		iaNewNumber[1]=iaNewNumber[3];
		iaNewNumber[3]=iTemp;
		
		System.out.print("The encrypted number is:");
		for(int i=0;i<4;i++) 
		{
			System.out.print(iaNewNumber[i]);
		}
	}
}
