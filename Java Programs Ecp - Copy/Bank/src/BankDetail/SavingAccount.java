package BankDetail;

public class SavingAccount extends Account {

	 static float instrestrate;

	SavingAccount() {

	}

	static {
		instrestrate = 7.8f;
	}

	public SavingAccount(int acc_no, String name, double balance) {
		super(acc_no, name, balance);
		//this.instrestrate =instrestrate;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("The interest rate of Saving accout is : " +instrestrate);

		System.out.println("The amount after cal balance is : "+Calbalance());
	}

	@Override
	public double Calbalance() {
		// TODO Auto-generated method stub
		

		return balance = balance + (balance * instrestrate / 100);
	}

	@Override
	public void withdraw(double amt) {
		
		if (balance - amt >= 1000) {
			balance -= amt;
			System.out.println("Withdraw successful, new balance is :" + balance);

		}

		else {
			System.out.println("Withdrawal denied minimum balannce should be 1000 compulsary");
		}
	}

	public static float getInstrestrate() {
		return instrestrate;
	}
	
	

}
