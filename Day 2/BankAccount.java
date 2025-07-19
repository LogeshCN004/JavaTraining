package logesh;

public class BankAccount {
	String name;
	double balance;
	BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited "+amount+" Rupees. Updated Balance: "+balance);
	}
	void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew "+amount+" Rupees. Updated Balance: "+balance);
		} else  {
			System.out.println("Not enough balance");
		}
	}
	void displayBalance() {
		System.out.println("Final Balance: "+balance+" Rupees.");
	}
	public static void main(String [] args) {
		BankAccount bank = new BankAccount("Mohan Raja", 30000);
		System.out.println("Account Holder Name: "+bank.name);
		System.out.println("Current Balance: "+bank.balance);
		bank.deposit(25000);
		bank.withdraw(4000);
		bank.displayBalance();
	}
}