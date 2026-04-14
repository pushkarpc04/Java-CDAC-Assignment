public class AccountDemo {
    public static void main(String [] args) {
	BankAccount a1;
	a1 = new BankAccount(1001, 10000.0);
	a1.display();
	System.out.println("The interest rate is : "+BankAccount.getRate());
	
	System.out.println("The balance  interest is "+a1.calInterest());
	System.out.println("The balance after adding interest is "+a1.calInterest1());
	
	BankAccount.updateRate(8.4f);
	
	System.out.println("After updating the interest rate : "+BankAccount.getRate());
	
	System.out.println("The balance  interest is "+a1.calInterest());
	System.out.println("Balance after the updated interest rate: "+a1.calInterest1());
	}
}