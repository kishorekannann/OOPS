/*
Design a class BankAccount with the following specification :

Attributes :

accountNumber (string) : Represents the account number of the user's account
balance (double) : Represents the balance of the account
Constructor :

Implement a parameterised constructor to have the accountNumber and balance initialised while creating the object.
Methods :

deposit (double amount) : It adds the amount to the balance of the user's account.
withdraw (double amount) : It deducts the money (amount) from the balance. If the balance is insufficient then print "Insufficient funds!" and do not change the original amount.
displayDetails() : It diplays the accuntNumber and balance of the account.

 */
import java.util.Scanner;

class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }
        else{
            this.balance = 0.00;
            System.out.println("Insufficient funds!");
        }
    }

    public void deposit(double amount){
       balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance) balance -= amount;
        else{
            System.out.println("Insufficient funds!");
        }
    }
    public void displayDetails(){
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance : %.2f\n", balance);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        // Input account number and initial balance
        String accountNumber = sc.nextLine();
        double balance = sc.nextDouble();

        // Create a BankAccount object with the use of parameterised constructor
        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit money
        double addBalance = sc.nextDouble();
        account.deposit(addBalance);

        // Withdraw money
        double withdrawBalance = sc.nextDouble();
        account.withdraw(withdrawBalance);

        // Display account details
        account.displayDetails();

        sc.close(); // Close the scanner
    }
}
