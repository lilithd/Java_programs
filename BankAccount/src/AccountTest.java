import java.util.Scanner;

public class AccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BankAccount account;
		double balance, interestRate, pay, cashNeeded;
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("What is your account's starting balance?");
		balance = kbd.nextDouble();
		
		System.out.println("What is your monthly interest rate?");
		interestRate = kbd.nextDouble();
		account = new BankAccount(balance, interestRate);
		
		System.out.println("How much were you paid this month?");
		pay = kbd.nextDouble();
		
		account.Deposit(pay);
		System.out.println("Your current balance is: " + account.getBalance());
		
		System.out.println("How much would you like to withdraw?");
		cashNeeded = kbd.nextDouble();
		account.withdrawal(cashNeeded);
		account.addInterest();
		System.out.println("This month you have earned $" 
							+ account.getInterest() 
							+ " in interest.");
		System.out.println("You now have $" 
							+ account.getBalance() 
							+ " in your account." );
		
		System.out.println("Your balance is: $" + account.getBalance());
		
		kbd.close();
		
	}

}