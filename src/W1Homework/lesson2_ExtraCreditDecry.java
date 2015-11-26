package W1Homework;
import java.util.*;
public class lesson2_ExtraCreditDecry {

	public static void main(String[] args) {
		Scanner mScanner=new Scanner(System.in);
		System.out.print("Input an four-digit Interger:");
		int iNumber=mScanner.nextInt();
		int[] iaOriginalNumber=new int[4];
		int[] iaNewNumber=new int[4];
		iaNewNumber[0]=iNumber/1000;
		iaNewNumber[1]=(iNumber-1000*iaNewNumber[0])/100;
		iaNewNumber[2]=(iNumber-1000*iaNewNumber[0]-100*iaNewNumber[1])/10;
		iaNewNumber[3]=iNumber-1000*iaNewNumber[0]-100*iaNewNumber[1]-10*iaNewNumber[2];
		
		iaOriginalNumber[1]=iaNewNumber[3];
		iaOriginalNumber[3]=iaNewNumber[1];
		iaOriginalNumber[2]=iaNewNumber[0];
		iaOriginalNumber[0]=iaNewNumber[2];

		for(int i=0;i<4;i++) 
		{
			iaOriginalNumber[i]=iaOriginalNumber[i]-7;
			if(iaOriginalNumber[i]<0)
			{
				iaOriginalNumber[i]+=10;
			}
		}
		System.out.print("The Original number is:");
		for(int i=0;i<4;i++) 
		{
			System.out.print(iaOriginalNumber[i]);
		}
	}
}
