
import java.util.Scanner; 
public class recursion_print_incDec
{
    public static void printincdec(int n)
    {
        if (n==0)
        {
            return;
        }
        
        System.out.println(n);
        printincdec(n-1);
        System.out.println(n);
        
    }
    public static void main (String [] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        printincdec(n);
    }
}
