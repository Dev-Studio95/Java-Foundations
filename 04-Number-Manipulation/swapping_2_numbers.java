/*
 * Question: Swap the values of two input numbers.
 * Approach: Store the first number in a temporary third variable (c), 
 * move the second number into the first, and then assign the temporary variable to the second.
 */
import java.util.*;

class swapping_2_numbers 
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        
        System.out.println("Enter 2 numbers...");
        a = in.nextDouble();
        b = in.nextDouble();
        
        System.out.println("Before swapping... " + a + " and " + b);
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("After swapping...! " + a + " and " + b);
    }
}
