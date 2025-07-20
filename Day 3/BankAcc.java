package logesh;
import java.util.Scanner;
class BankAcc {
	String bankname, bankbranch;
	void bankName(String bankname) {
		this.bankname = bankname;
		System.out.println("Bank Name: "+bankname);
	}
	void bankBranch(String bankbranch) {
		this.bankbranch = bankbranch;
		System.out.println("Bank Branch: "+bankbranch);
	}
}
class AccHolder extends BankAcc {
	String holdername;
	long accountnum;
	void holderName(String holdername) {
		this.holdername = holdername;
		System.out.println("Account Holder Name: "+holdername);
	}
	void accountNumber(long accountnum) {
		this.accountnum = accountnum;
		System.out.println("Account Number: "+accountnum);
	}
}
class SavingsAccount extends AccHolder {
	double interest;
	void interestRate(double interest) {
		this.interest = interest;
		System.out.println("Interest Rate: "+interest+"%");
	}
}
class BankSavings {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAccount sa = new SavingsAccount();
		System.out.print("Enter Bank Name: ");
		String bn = sc.nextLine();
		System.out.print("Enter Bank Branch: ");
		String bb = sc.nextLine();
		System.out.print("Enter Account Holder Name: ");
		String an = sc.nextLine();
		System.out.print("Enter Account Number: ");
		long no = sc.nextLong();
		System.out.print("Enter Interest Rate (%): ");
		double ir = sc.nextDouble();
		sc.nextLine();
		System.out.print("------Bank Account Details------\n");
		sa.bankName(bn);
		sa.bankBranch(bb);
		sa.holderName(an);
		sa.accountNumber(no);
		sa.interestRate(ir);
		sc.close();	
	}
}
