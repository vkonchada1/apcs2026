
/**
 * Write a description of class BankDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankDriver
{
    public static void main(String args[]) {
        //Create BankAccount objects using constructors
        BankAccount acc1 = new BankAccount("Vinesh Konchada", 1000.0);
        BankAccount acc2 = new BankAccount(); //Uses the default constructors
        
        //An accessor method doesn't allow you to change the class variable
        //acc1.getBalance() = 5000.0;
        
        if (acc1.withdraw(250.00) == true) {
            System.out.println("You sucessfully withdrew $250. You have $"+acc1.getBalance()+" left in the account.");
        }
        else {
            System.out.println("You don't have enough money in your account.");
        }
        //A method that returns a boolean, can be used be used directly in a condition
        if (acc2.withdraw(250.00) == true) {
            System.out.println("You sucessfully withdrew $250.");
        }
        else {
            System.out.println("You don't have enough money in your account. You have $"+acc1.getBalance()+" left in the account.");
        }
        
        acc1.applyInterest(4.0, 12); //Apply a 4% annual rate
        
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
