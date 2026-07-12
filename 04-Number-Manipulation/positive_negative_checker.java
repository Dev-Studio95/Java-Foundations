/*
 * Question: Check if an input number is positive, negative, or zero.
 * Approach: Use if-else-if ladder to compare the number against 0. 
 * If > 0, it is positive; if < 0, negative; otherwise, it must be zero.
 */
import java.util.*;

class positive_negative_checker
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        int n;
        
        System.out.println("Enter a number...");
        n = in.nextInt();
        
        if (n > 0) 
        {
            System.out.println("Positive number.");
        } 
        else if (n < 0) 
        {
            System.out.println("Negative number.");
        } 
        else 
        {
            System.out.println("Number is equal to 0.");
        }
    }
}
