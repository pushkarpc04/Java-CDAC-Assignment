package BankDetail;

public class RecurrentAccount extends Account {

	private double insatallmentamt; 
	private int noofinstallment;
	
	public RecurrentAccount() {
		
	}

	public RecurrentAccount(int acc_no, String name, double balance, double insatallmentamt, int noofinstallment) {
		super(acc_no, name, balance);
		this.insatallmentamt = insatallmentamt;
		this.noofinstallment = noofinstallment;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("The amount after cal balance is : "+Calbalance());
	}

	@Override
	public double Calbalance() {
		// TODO Auto-generated method stub
		
		
		return balance = balance +(insatallmentamt * noofinstallment )+ SavingAccount.getInstrestrate();
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		System.out.println("The withdraw is not supported in recurrent account");
	}
	
	
	
}
