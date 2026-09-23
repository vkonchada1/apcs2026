
/**
 * Write a description of class MovieTicket here.
 *
 * Vinesh Konchada
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class MovieTicketSwitch
{
    public static void main(String[] args){
        //Create constant variables
        // A constant variable CAN'T be changed
        final double REGULAR_PRICE = 12.50;
        final double DISCOUNT_PRICE = 8.00;
        final double IMAX_SURCHARGE = 5.00;
        final double IMAX_70MM_SURCHARGE = 8.00;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("---Movie Ticket Calculator---");
        System.out.println("Select Movie Format: ");
        System.out.println("1 - Standard Format");
        System.out.println("2 - IMAX");
        System.out.println("3 - IMAX 70MM (As Nolan Intended)");
        System.out.print("Enter choice (1-3): ");
        int format = scan.nextInt();
        
        System.out.print("Enter the customer's age: ");
        int age = scan.nextInt();
        
        //Set matinee to true if the user enters "y"
        System.out.print("Is this a matinee showtime? (y/n): ");
        String isMatinee = scan.next();
        boolean matinee = false;
        
        if (isMatinee.toLowerCase().equals("y")){
            matinee = true;
        }
        
        // Set pass to true if the user enter "y"
        System.out.print("Does this customer have a pass? (y/n): ");
        String hasPass = scan.next();
        boolean pass = hasPass.toLowerCase().equals("y");
        
        double ticketPrice;
        
        switch(format){
        case(1):
            //discount applies if <13, >= 65 OR its a matinee and they have a pass
            if (age < 13 || age >= 65 || (matinee && pass)){
                ticketPrice = DISCOUNT_PRICE;
                System.out.println("Status: Discount Applied!");
            }
            else{
                ticketPrice = REGULAR_PRICE;
                System.out.println("Status: Regular Rate Applied.");
                
            }
        break;
        case(2):
            ticketPrice = REGULAR_PRICE + IMAX_SURCHARGE;
            System.out.println("Status: IMAX Surcharge Applied.");
        break;
        case(3):
            ticketPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;
            System.out.println("Status: IMAX 70mm Surcharge Applied.");
        break;
        default:
            ticketPrice = REGULAR_PRICE;
            System.out.println("Status: Incorrect entry. Regular Price Applied.");
        break;
        }
        System.out.println("Total Due: " + money.format(ticketPrice));
        
        
        switch(age){
            case(9):
            System.out.println("Your are a Freshman!");
            case(10):
            System.out.println("Your are a Sophmore like me!");
            case(11):
            System.out.println("Your are a Junior!");
            case(12):
            System.out.println("Your are a Senior!");
        }
        
    } 
    }
        

