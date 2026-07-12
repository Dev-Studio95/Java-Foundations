/*
 * Question: Accept 2 numbers and find the smaller one.
 * Approach: Use a basic if-else conditional block to compare the two numbers. 
 * Print the first number if it is smaller; otherwise, print the second.
 */
import java.util.*;

class smaller_of_2_number 
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        double n1, n2;
        
        System.out.println("Enter 2 no...");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        
        if (n1 < n2) 
        {
            System.out.println("Smaller no. =" + n1);
        } 
        else 
        {
            System.out.println("Smaller no. =" + n2);
        }
    }
}
