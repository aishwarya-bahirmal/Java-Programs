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
        Scanner sobj = new Scanner(System.in);
        int icnt = 0;
        System.out.println(" Enter " + Arr.length + " Elements ");
        for(icnt = 0; icnt < Arr.length; icnt++)
        {
            System.out.println("User want this element:");
            Arr[icnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int icnt = 0;
        for(icnt = 0; icnt < Arr.length; icnt++)
        {
            System.out.println(Arr[icnt]);
        }
    }
}

class Child extends Parent
{
    public Child(int isize)
    {
        super(isize);
    }

    public void DivisibleByFive()
    {
        int icnt = 0;
        for(icnt = 0; icnt < Arr.length; icnt++)
        {
            if(Arr[icnt] % 5 == 0)
            {
                System.out.println ( ( Arr[icnt] ) + " These num are Divisible By Five ");
                
            }
        }
    }
}
class Ass322
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Hey user how many num u want:");
        int isize = sobj.nextInt();

        Child cobj = new Child(isize);
        cobj.Accept();
        cobj.Display();
        cobj.DivisibleByFive();

    }
}