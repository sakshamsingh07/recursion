import java.util.Scanner; 
public class recursion_print_decrease
{
    public static void printdecrese(int n)
    {
        if (n==0)
        {
            return;
        }
        System.out.println(n);
        printdecrese(n-1);
    }
    public static void main (String [] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        printdecrese(n);
    }
}