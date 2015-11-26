package W1Homework;

public class lesson2_8 {

	public static void main(String[] args) {
		String[] saStudentAnswer={"ABACCDEEAD","DBABCAEEAD","EDDACBEEAD","CBAEDCEEAD","ABDCCDEEAD","BBECCDEEAD","BBACCDEEAD","EBECCDEEAD"};
		char[][] caStudentAnswer=new char[saStudentAnswer.length][saStudentAnswer[1].length()];

		for(int i=0;i<saStudentAnswer.length;i++)
		{
			for(int j=0;j<saStudentAnswer[i].length();j++)
			{
				caStudentAnswer[i][j]=saStudentAnswer[i].charAt(j);
			}
		}

		char[] caKey={'D','B','D','C','C','D','A','E','A','D'};
		int[] iaStidentScore=new int[saStudentAnswer.length];
		
		for(int i=0;i<iaStidentScore.length;i++)
		{
			iaStidentScore[i]=0;
		}
		for(int i=0;i<saStudentAnswer.length;i++)
		{
			for(int j=0;j<saStudentAnswer[i].length();j++)
			{
				if( caStudentAnswer[i][j]==caKey[j])
				{
					iaStidentScore[i]=iaStidentScore[i]+1;
				}
			}
		}
		for(int i=0;i<iaStidentScore.length;i++)
		{
			System.out.printf("Student %d's correct count is %d\n", i,iaStidentScore[i]);
		}
	}

}
