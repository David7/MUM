package lesson3democode.datetimepack;

public class BankCustomer {

	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	int age;
	double balance;
	
	public void saving(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		if(balance>amount) 
			balance-= amount;
		else
			System.out.print("Enough Balance!");
	}
	
	public BankCustomer(String name, int age, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.balance = balance;
	}
	public static void main(String[] args) {
		BankCustomer Jack=new BankCustomer("Jack",34,1000.00);
		Jack.saving(100);
		double dBalane=Jack.getBalance();
		System.out.println("The Balance is:"+dBalane);
		Jack.withdraw(1000);
		dBalane=Jack.getBalance();
		System.out.println("The Balance is:"+dBalane);
	}

}
