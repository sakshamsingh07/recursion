import java.util.Scanner; 
public class recursion_print_increasing
{
    public static void printincreasing(int n)
    {
        if (n==0)
        {
            return;
        }
        printincreasing(n-1);
        System.out.println(n);
        
    }
    public static void main (String [] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        printincreasing(n);
    }
}
