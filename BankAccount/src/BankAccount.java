
/**
 * @author lilithd
 *
 */
public class BankAccount {
		private double balance;
		private double interestRate;
		private double interest;
		
	public BankAccount(double startBalance, double intRate){
		balance = startBalance;
		interestRate = intRate;
		interest = 0.0;
		
	}
	
	public void Deposit(double amount){
		balance += amount;
	}
	
	public void withdrawal(double amount){
		balance -= amount;
	}
	
	public void addInterest(){
		interest = interestRate * balance;
		balance += interest;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getInterest(){
		return interest;
	}
	
	

}
