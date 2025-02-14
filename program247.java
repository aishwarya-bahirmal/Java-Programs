import java.util.*;

class program247
{
    static int Addition(int i,int j)
    {
        int sum=0;
        sum=i+j;
        return sum;
    }
    public static void main(String arg[])
    {
     Scanner sobj = new Scanner(System.in);

     int iNo1=0,iNo2=0,iAns=0;

     System.out.println("Enter 1st no:");
     iNo1=sobj.nextInt();

     System.out.println("Enter 2nd no:");
     iNo2=sobj.nextInt();

     iAns=Addition(iNo1,iNo2);
     System.out.println("Addition is:"+iAns);

    }
}