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
        System.out.println();
    }
}

class Child extends Parent
{
    public Child(int isize)
    {
        super(isize);
    }

    public void Multipleof11()
    {
        int icnt = 0;
        int iNo = 0;
        for(icnt=0; icnt < Arr.length; icnt++)
        {
           for(iNo = 1; iNo <= 10; iNo++)
           {
            if(Arr[icnt] == iNo * 11)
            {
                System.out.print(Arr[icnt] + " 
                \t ");
            }
            
           }
        }
        
    }
}
class Ass325
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Hey user how many num u want:");
        int isize = sobj.nextInt();

        Child cobj = new Child(isize);
        cobj.Accept();
        cobj.Display();
        cobj.Multipleof11();

    }
}