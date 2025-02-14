class Loops
{
    public static void main(String arg[])
    {
        int Arr[] = {10,20,30,40};
        int iCnt = 0;

        System.out.println("Traversal of array using for loop");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        System.out.println("Traversal of array using while loop");
        iCnt = 0;
        while(iCnt < Arr.length)
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }
    System.out.println("Traversal of array using for loop");
    while(iCnt < Arr.length)
    {
        System.out.println(Arr[iCnt]);
        iCnt++;
    }
}