import java.util.Scanner; 
public class powerlog
{
    public static int power(int x, int n)
    {
        if (n==0)
        {
            return 1 ;
        }
        int recans= power ( x,n/2);
        int recans1= power ( x,n/2);
        int myans = recans*recans1;
        // return myans;
        if (n%2!=0)
        {
            myans*=x;
        }
        return myans;
    }
    public static void main (String [] args)
    {
        Scanner scn = new Scanner (System.in);
        int x= scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }
}
