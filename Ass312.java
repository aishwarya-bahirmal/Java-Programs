//write a java program in which accept the string from user and coun small character.....

import java.util.*;

class Small
{
    public int countsmall(String s)
    {
        int icnt = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if((s.charAt(i)>='a') && (s.charAt(i)<='z'))
            {
                icnt++;
            }
        }
        return icnt;
    }
}
class Ass312
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Plz Enter the string:");
        String str = sobj.nextLine();

        Small obj = new Small();
        int iRet = obj.countsmall(str);

        System.out.println("count of small char are:"+iRet);
    }
}