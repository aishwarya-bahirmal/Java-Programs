import java.util.*;

class Ass315
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter string");
       String s = sobj.nextLine();

       char Arr[] = s.toCharArray();
       for(int i=Arr.length-1;i>=0;i--)
       {
           System.out.print(Arr[i]+"\t");
       }
    }
}
