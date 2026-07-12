/*
 * Question: Deduct Provident Fund from total salary, then calculate Rent and Education allowances from the remainder.
 * Approach: Read the initial salary. Deduct 12% for PF, update the salary variable, 
 * then calculate 10% for Rent and 20% for Education from that remaining balance.
 */
import java.util.*;

class Salary_Expenditure_Calc
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        double s, pf, r, e;
        System.out.println("Enter salary..");
        s = in.nextDouble();
        
        pf = (12.0 / 100.0) * s;
        s = s - pf;
        r = (10.0 / 100.0) * s;
        e = (20.0 / 100.0) * s;
        
        System.out.println("Provident Fund =" + pf);
        System.out.println("Spent on Rent =" + r);
        System.out.println("Spent on Education =" + e);
    }
}
