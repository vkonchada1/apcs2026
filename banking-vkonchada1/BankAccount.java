
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
    
    // Withdraw the given amount
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionCount++;
            return true;
        }
        return false;
    }
    
    
    
    
}
