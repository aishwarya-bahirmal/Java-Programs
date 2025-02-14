//write a java program in which take string from user and count captital character.....

import java.util.*;

class capital
{
    public int countcapital(String s)
    {
        int icnt = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i)>='A') && (s.charAt(i)<='Z'))
            {
                icnt++;
            }
        }
        return icnt;
    }
   
}
class Ass311
{
    
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Plz Enter the sttring:");
        String str = sobj.nextLine();

        capital cobj = new capital();
        int iRet = cobj.countcapital(str);

        System.out.println("count of capital character are:"+iRet);

    }
}
