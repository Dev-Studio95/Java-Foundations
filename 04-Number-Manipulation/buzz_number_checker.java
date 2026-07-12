/*
 * Question: Check if a number is a "Buzz" number.
 * Approach: A number is a Buzz number if it ends in 7 or is divisible by 7. 
 * Use the modulo operator (%) to check the last digit (n % 10 == 7) and divisibility (n % 7 == 0).
 */
import java.util.*;

class buzz_number_checker 
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        int n;
        
        System.out.println("Enter a number...");
        n = in.nextInt();
        
        if (n % 7 == 0) 
        {
            System.out.println("Buzz number.");
        } 
        else if (n % 10 == 7) 
        {
            System.out.println("Buzz number.");
        } 
        else 
        {
            System.out.println("Not a Buzz number.");
        }
    }
}
