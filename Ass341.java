import java.util.*;
class Parent
{
    public int Arr[];
    public Parent(int isize)
    {
        Arr = new int[isize];
    }
    public void Accept()
    {
        int icnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("user want this elements:");
        for(icnt = 0; icnt < Arr.length; icnt++)
        {
            System.out.println("Enter the element " + (icnt+1));
            Arr[icnt] = sobj.nextInt();
        }
        System.out.println();
    }

    public void Display()
    {
        int icnt = 0;
        for(icnt = 0; icnt < Arr.length; icnt++)
        {
            System.out.print(Arr[icnt] + "\t");
        }
        System.out.println();
    }
}

class Child extends Parent
{
    public Child(int isize)
    {
        super(isize);
    }
    public Boolean CheckNum()
    {
       
        int icnt = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Take one Num:");
        int iNum = sobj.nextInt();

        for(icnt = 0; icnt < Arr.length; icnt++)
        {
            if(Arr[icnt] == iNum)
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
   
class Ass341
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("How many elements u want : ");
        int isize = sobj.nextInt();

        Child cobj = new Child(isize);
        cobj.Accept();
        cobj.Display();
    
        
        Boolean bRet = cobj.CheckNum();
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