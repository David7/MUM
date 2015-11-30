package homework;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class DeptEmployee
{	
	String name;
	double salary;
	LocalDate hiredate;
	DeptEmployee()
	{
		
	}
	DeptEmployee(String name,double salary,String sHiredate)
	{
		this.name=name;
		this.salary=salary;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
		this.hiredate=LocalDate.parse(sHiredate,formatter);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	
	public double computeSalary()
	{
		return salary;
	}

}
class Professor extends DeptEmployee
{
	int numberOfPublications;
	Professor(String name,double salary,String sHiredate)
	{
		super(name,salary,sHiredate);
	}
	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}

class Secretary extends DeptEmployee
{
	double overtimeHours;
	Secretary(String name,double salary,String sHiredate)
	{
		super(name,salary,sHiredate);
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	public double computeSalary()
	{
		return salary+12*overtimeHours;
	}

}

public class lesson5_1 {

	public static void main(String[] args) {
		
		DeptEmployee[] department =new DeptEmployee[5];
		department [0]=new Professor("John",65000.0,"2000-10-01");
		department [1]=new Professor("Jack",69000.0,"2010-9-01");
		department [2]=new Professor("David",85000.0,"2016-7-01");
		
		department [3]=new Secretary("Thomas",45000.0,"2000-10-01");
		department [4]=new Secretary("Martin",54000.0,"2000-10-01");
		
		Scanner mScanner=new Scanner(System.in);
		System.out.print("If you wishe to see the sum of all Professors and all secretary's salary, press Y:");
		String mString=mScanner.next();
		//mScanner.next()
		if(mString.equals("Y"))
		{
			double dSalarySum=0f;
			for(DeptEmployee e:department)
			{
				dSalarySum+=e.computeSalary();
			}
			System.out.print("Sum of All people's salary:"+dSalarySum);
		}
		
	}

}
