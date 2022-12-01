import java.util.Scanner; 
public class printzigzag
{
    public static void imp(int n)
    {
        if (n==0)
        {
            return;
        }
        System.out.println(n);
        imp(n-1);
        System.out.println(n);
        imp(n-1);
        System.out.println(n);
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        imp(n);
    }
}
