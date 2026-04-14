import java.util.*;

class BankAccount {
	private int Acc_no;
	private double balance;
	
	static float interest_rate;
	
	static {
 	interest_rate = 7.25f;
    }	

	
	BankAccount(int Acc_no, double balance){
		this.Acc_no =Acc_no;
			this.balance = balance;
	}
	
	public void display(){
		System.out.println("The account number is : "+Acc_no);
		
		System.out.println("The balance present in this account is : "+balance);
	}
	
	
	
	public static float getRate() {
	return interest_rate;
    }
	public double calInterest(){
	 return balance *(interest_rate /100);
		 
	}
	
	public double calInterest1(){
	double	balance2 = balance *(interest_rate /100);
		return balance + balance2;
	}
	public static void updateRate(float newRateofInterest){
		interest_rate = newRateofInterest;
	}
}