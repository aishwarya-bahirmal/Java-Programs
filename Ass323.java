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

        System.out.println(" Enter "+ Arr.length + " Elements ");
        for(icnt=0; icnt < Arr.length; icnt++)
        {
            System.out.println("Enter the element "+ (icnt+1));
            Arr[icnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int icnt = 0;
        for(icnt=0; icnt<Arr.length; icnt++)
        {
        
            System.out.print(Arr[icnt] + "\t");
        }
    }
}

class Child extends Parent
{
    public Child(int isize)
    {
        super(isize);
    }

    public void EvenAndDivisibleByFive()
    {
        int icnt = 0;
        for(icnt=0; icnt < Arr.length; icnt++)
        {
            if((Arr[icnt] % 2 == 0)  && (Arr[icnt] % 5 == 0))
            {
                System.out.print(Arr[icnt]);
            }
            System.out.println();
        }
        
    }
}
class Ass323
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Hey user how many num u want:");
        int isize = sobj.nextInt();

        Child cobj = new Child(isize);
        cobj.Accept();
        cobj.Display();
        cobj.EvenAndDivisibleByFive();

    }
}