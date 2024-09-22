import java.util.ArrayList;

public class PersonalAccount
{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            Amount newAmount = new Amount(amount, Amount.TransactionType.DEPOSIT);
            transactions.add(newAmount);
            balance += amount;
            System.out.println("Deposit: " + amount);
        }
        else
        {
            System.out.println("Invalid Deposit Amount");
        }
    }
    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            Amount newAmount = new Amount(amount, Amount.TransactionType.WITHDRAWAL);
            transactions.add(newAmount);
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }
        else
        {
            System.out.println("Error! Not enough money on balance");
        }
    }
    public void printTransactionHistory()
    {
        System.out.println("Account: " + accountNumber + " Transaction History:");
        for(Amount element : transactions)
        {
            System.out.println(element.getTransactionType() + ":" + element.getAmount());
        }
    }
    public double getBalance()
    {
        return balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getAccountHolder()
    {
        return accountHolder;
    }
}
