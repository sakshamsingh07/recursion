import java .util.Scanner; 
public class powerRecursion
{
    public static int power(int x , int n)
    {
        if (n==0)
        {
            return(1);
        }
        int recans = power(x,n-1);
        int myans = recans*x;
        return myans;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner (System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
        // power(x,n);
    }
}
