//write a java program ...

import java.util.*;

class Frequency
{
   public int capsmall(String s)
   {
    int cnt = 0;
    int icnt = 0;
    int iNo = 0;

    for(int i=0; i<s.length(); i++)
    {
        if((s.charAt(i)>='A') && (s.charAt(i)<='Z'))
        {
            cnt++;
        }
        else if((s.charAt(i)>='a') && (s.charAt(i)<='z'))
        {
            icnt++;
        } 
   }
        iNo = cnt - icnt;
        if(iNo<0)
         {
             iNo = -iNo;
         } 
         return iNo;
 }
 
 
}

   

class Ass313
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Plz Enter the string:");
        String str = sobj.nextLine();

        Frequency fobj = new Frequency();
        int iRet = fobj.capsmall(str);

        System.out.println("Frequency of char is:"+iRet);


    }
}
