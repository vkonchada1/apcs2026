
/**
 * Write a description of class BankAccount here.
 *
 * @author Vinesh Konchada
 * @version 11/4/2026
 */

//Step 1: create class header
public class BankAccount
{
    //Step 2: create the class variables
    //Encapsulated instance data 
    private String accountHolder;
    private double balance;
    private int transactionCount;
    
    //Constant definition
    private static final double MIN_BALANCE = 0.0;
    
    //Step 3: create the class constructor(s)
    //Default Constructor (No Parameters)
    public BankAccount() {
        //this refers to the current instance of the class (object)
        this.accountHolder = "Unnamed";
        this.balance = 0.0;
        this.transactionCount = 0;
    }
    
    // Overloaded constructor with parameters
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if(initialBalance >= BankAccount.MIN_BALANCE) 
            this.balance = initialBalance;
        else
            this.balance = BankAccount.MIN_BALANCE;
        this.transactionCount = 0;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    // Withdraw the given amount
    //mutator method (method that changes a class variable)
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            this.transactionCount++;
            return true;
        }
        return false;
    }
    
    //Adds interest to the account balance (Mutator method)
    public void applyInterest(double annualRate, int months) {
        double monthlyRate = (annualRate/ 100.0)/12.0f;
        for (int m = 1; m <= months; m++) {
            this.balance += this.balance * monthlyRate;
        }
    }
    
    // The toString method determines what String is returned when you try to print a BankAccount object 
    public String toString() {
        return "Account: "+this.accountHolder+" | Balance: $"+
            String.format("%.2f", this.balance) + " | Transactions: "+
            this.transactionCount;
    }
}
