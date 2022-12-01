import java.util.Scanner; 
public class revstri
{
    public static void rev(String str)
    {
        if(str.length()<=0)
        {
            System.out.println(str);
        }
        else
        {
            System.out.print(str.charAt(str.length()-1));
            rev(str.substring(0,str.length()-1));
        }
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner (System.in);
        String s =scn.next();
        rev(s);
    }
    
}
