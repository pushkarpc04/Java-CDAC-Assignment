package BankDetail;

public abstract class Account {

	private int acc_no;
	private String name;
	protected double balance;
	
	
	public Account() {
		
	}


	public Account(int acc_no, String name, double balance) {
		super();
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("Account number is : "+acc_no);
		System.out.println("The name of account :"+name);
		System.out.println("The balance in account : "+balance);
		
	}
	public abstract double Calbalance();
	public abstract void withdraw(double amt);
	
}
