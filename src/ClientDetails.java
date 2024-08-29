public class ClientDetails
{
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount(1000);
        BankAccount otherBankAccount = new BankAccount(500);

        System.out.println("The Balance after Deposit is :" + bankAccount.deposit(100));
        System.out.println("The Balance after Withdrawing is :" + bankAccount.withdraw(100));

        bankAccount.transferBalance(100, otherBankAccount);
        System.out.println("The New Balance in the Bank Account is:" + bankAccount.getBalance());
        bankAccount.printBalance();


    }
}