import java.util.*;
class Digit
{
    public int countOddDigits(int iNo)
    {
        int iDigit = 0;
        int icnt = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            if(iDigit % 2 != 0)
            {
                icnt++;
            }
            iNo= iNo / 10;
        }
        return icnt;
    }
}
class Ass332
{
    public static void main(String arg[])
    {
        Scanner sobj =  new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.countOddDigits(iNo);

        System.out.println("count of odd digits are:"+iRet);
    }
}