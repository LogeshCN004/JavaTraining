// Java Program to check balance of bank account holder
import java.util.Scanner;
public class Bank {
    String accountHolder;
    double balance;
    void checkBalance() {
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank();
        System.out.println("Account Holder:");
        b1.accountHolder = sc.nextLine();
        System.out.println("Balance:");
        b1.balance  = sc.nextDouble();
        b1.checkBalance();
    }
}
// Output:
// Account Holder: Rajaram
// Balance: 30500.25
