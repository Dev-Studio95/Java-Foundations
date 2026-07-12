/*
 * Question: Input total seconds and break it down into hours, minutes, and remaining seconds.
 * Approach: Divide total seconds by 3600 to find hours. Use the remainder (%) operator 
 * to track leftover seconds, dividing by 60 to find minutes and capturing the final remainder.
 */
import java.util.*;

class time_conversion
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        int h, m, s;
        System.out.println("Enter seconds...");
        s = in.nextInt();
        
        h = s / 3600;
        s = s % 3600;
        m = s / 60;
        s = s % 60;
        
        System.out.println(h + "hours" + m + "minutes" + s + "seconds");
    }
}
