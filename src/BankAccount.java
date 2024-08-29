public class BankAccount
{
    private double balance;

    public BankAccount()
    {

    }

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public double deposit(double amount)
    {
        return balance + amount;
    }

    public double withdraw(double amount)
    {
        return balance - amount;
    }

    public void printBalance()
    {
        System.out.println("The current account balance is: " + balance);

    }

    public void transferBalance(double amount, BankAccount otherAccount)
    {
        balance = withdraw(amount);
        otherAccount.deposit(amount);
    }

    public double getBalance() {
        return balance;
    }

    }

