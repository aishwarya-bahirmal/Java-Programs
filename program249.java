import java.util.*;

class Arithmatic
{
    public int ival1;
    public int ival2;

    public Arithmatic(int i,int j)
    {
        ival1=i;
        ival2=j;
    }
    public int Addition()
    {
        int sum=0;
        sum=ival1+ival2;
        return sum;
    }
}

class program249
{
   
    public static void main(String arg[])
    {
     Scanner sobj = new Scanner(System.in);

     int iNo1=0,iNo2=0,iAns=0;

     System.out.println("Enter 1st no:");
     iNo1=sobj.nextInt();

     System.out.println("Enter 2nd no:");
     iNo2=sobj.nextInt();

     Arithmatic aobj=new Arithmatic(iNo1,iNo2);

     iAns=aobj.Addition();
     System.out.println("Addition is:"+iAns);

    }
}