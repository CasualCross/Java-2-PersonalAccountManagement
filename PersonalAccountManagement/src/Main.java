import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Personal Account Manager");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String accountHolder = scanner.nextLine();
        PersonalAccount myAccount = new PersonalAccount(101, accountHolder);

        while(true)
        {
            System.out.println(" ");
            System.out.println("Personal Account Manager: ");
            System.out.println("0) Exit");
            System.out.println("1) AccountNumber");
            System.out.println("2) AccountHolder");
            System.out.println("3) Balance");
            System.out.println("4) Deposit");
            System.out.println("5) Withdraw");
            System.out.println("6) Transaction History");
            int userInput = scanner.nextInt();

            if(userInput == 0)
            {
                break;
            }
            else if(userInput == 1)
            {
                System.out.println("Account Number: " + myAccount.getAccountNumber());
            }
            else if(userInput == 2)
            {
                System.out.println("Account Holder: " +myAccount.getAccountHolder());
            }
            else if(userInput == 3)
            {
                System.out.println("Account Balance: " +myAccount.getBalance());
            }
            else if(userInput == 4)
            {
                System.out.println("Enter Deposit Amount: ");
                double depositAmount = scanner.nextDouble();
                myAccount.deposit(depositAmount);
            }
            else if(userInput == 5)
            {
                System.out.println("Enter Withdraw Amount: ");
                double withdrawAmount = scanner.nextDouble();
                myAccount.withdraw(withdrawAmount);
            }
            else if(userInput == 6)
            {
                myAccount.printTransactionHistory();
            }
            else
            {
                System.out.println("Invalid Input");
            }

            Scanner waitScanner = new Scanner(System.in);
            System.out.println("\nPress Enter to continue...");
            waitScanner.nextLine();
        }
    }
}