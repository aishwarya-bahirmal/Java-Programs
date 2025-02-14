import java.util.*;

class Vowells
{
    public Boolean checkvowells(String s)
    {
        for(int i=0; i<s.length(); i++)
        {
            if((s.charAt(i)=='a') || (s.charAt(i)=='e') || (s.charAt(i)=='i') || (s.charAt(i)=='o') || (s.charAt(i)=='u'))
              {
                return true;
              }
            else
            {
               return false;
            }
        }
    }
}

class Ass314
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Plz Enter the string");
        String str = sobj.nextLine();

        Vowells vobj = new Vowells();
        boolean bRet = vobj.checkvowells(str);

        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}