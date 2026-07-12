/*
 * Question: Find the maximum and the second maximum among 3 numbers.
 * Approach: Use Math.max() and Math.min() to find the absolute highest and lowest. 
 * Subtract the max and min from the total sum of the three numbers to find the middle (second max).
 */
import java.util.*;

class max_and_middle_of_3_numbers
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        double n1, n2, n3, max, max_2, min;
        
        System.out.println("Enter 3 no...");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();
        
        max = Math.max(n1, n2);
        max = Math.max(max, n3);
        
        min = Math.min(n1, n2);
        min = Math.min(min, n3);
        
        max_2 = (n1 + n2 + n3) - (max + min);
        
        System.out.println("Max value =" + max);
        System.out.println("2nd Max value =" + max_2);
    }
}
