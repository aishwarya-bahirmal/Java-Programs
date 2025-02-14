class Demo 
{
    int Size;
    int Arr[];

    public Demo(int iNo)
    {
        Size = iNo;
        Arr = new int[Size]; 
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
        Arr = null;
    }
}
class FinalizeDemo
{
    public static void mian(String a[])
    {
        Demo obj = new Demo(4);
        obj = null;
    }
}