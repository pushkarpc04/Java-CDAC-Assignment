package apps;

import java.util.Scanner;

import BankDetail.Account;
import BankDetail.RecurrentAccount;
import BankDetail.SavingAccount;

public class Bankning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] accounts = new Account[5];

		for (int i = 0; i < accounts.length; i++) {
			System.out.println("\nEntering details for Account " + (i + 1));
			System.out.print("Select Type (1. Savings, 2. Recurring): ");
			int type = sc.nextInt();

			System.out.print("Enter Account Number: ");
			int accno = sc.nextInt();
			sc.nextLine(); // consume newline
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Initial Balance: ");
			double balance = sc.nextDouble();

			if (type == 1) {
				accounts[i] = new SavingAccount(accno, name, balance);
			} else if (type == 2) {
				System.out.print("Enter Installment Amount: ");
				double instAmt = sc.nextDouble();
				System.out.print("Enter Number of Installments: ");
				int noofinstallment = sc.nextInt();
				accounts[i] = new RecurrentAccount(accno, name, balance, instAmt, noofinstallment);
			} else if (type != 1 || type != 2) {
				System.out.println("Please choose correct option: ");
			}

			System.out.print("Enter amount to withdraw: ");
			double withdrawAmt = sc.nextDouble();
			accounts[i].withdraw(withdrawAmt);
			System.out.println("_____________________________________");
			double totalBalance = accounts[i].Calbalance();
			System.out.println("The final calculated balance (including interest/installments) is: " + totalBalance);
		}

		System.out.println("\n--- Final Account Reports ---");
		for (Account acc : accounts) {
			acc.display();
			System.out.println("---------------------------");
		}
		sc.close();
	}
	
}