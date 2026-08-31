
/**
 * Write a description of class TextTransformer here.
 *
 * Vinesh Konchada
 * 8/31/2026
 */

import java.util.Scanner;

public class TextTransformer
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Text Transformer");
        System.out.println("===========================");
        
        System.out.print("Enter a motvational quote: ");
        String phrase = scan.nextLine();
        
        //The length method return the number of characteristics in 
        int phraseLength = phrase.length();
        System.out.println("Total Characters (Including Spaces): " + phrase);
        
        //The replace method returns a new version of the old String 
        //and replaces the first character with the second characyter
        //The original String in NOT modified
        String securePhrase = phrase.replace('e','3');
        securePhrase = securePhrase.replace('a','@');
        
        System.out.println("Modified Phrase: " + securePhrase);
        System.out.println("Original Phrase: " + phrase);
        
        //Get the first 5 characters of our String
        //Example: You miss 100% f the shots you don't take.
        //Index #: 0123456789...
        //Substring returns a String from the first index number (including)
        //to the second index number (exclusive)
        //prefix = You m
        String prefix = phrase.substring(0,5);
        System.out.println("First 5 characters: " + prefix);
        
        //Returns a string from the given index (inclusive)
        //to the end of the original String
        String remainder = phrase.substring(5);
        System.out.println("Remaining Characters: " + remainder);
        
    }
}
