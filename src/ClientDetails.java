import java.util.Scanner;

public class ClientDetails
{
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount(1000);
        BankAccount otherBankAccount = new BankAccount(500);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to Deposit");
        double amount = Double.parseDouble(sc.nextLine()); // parsing string to double.
        System.out.println("Your Balance after Deposit is: " + bankAccount.deposit(amount));

        System.out.println("Enter amount to Withdraw");
        amount = Double.parseDouble(sc.nextLine());
        System.out.println("Your Balance after Withdrawal is: " + bankAccount.withdraw(amount));

        System.out.println("Enter the amount you want to transfer");
        amount = Double.parseDouble(sc.nextLine());
        bankAccount.transferBalance(amount, otherBankAccount);
        bankAccount.printBalance();


    }
}