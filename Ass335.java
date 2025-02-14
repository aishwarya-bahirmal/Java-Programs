import java.util.*;

class Digit
{
    
    public int Substraction(int iNo)
    {
        int iDigit = 0;
        int esum = 0;
        int osum = 0;
        int iDiv = 0;

        while(iNo != 0)
        {
            iDigit = iNo%10;
            if(iDigit % 2 == 0)
            {
                esum = esum + iDigit;
            }
            else if(iDigit % 2 != 0)
            {
                osum = osum + iDigit;
            }
            iNo = iNo / 10;
        }

        iDiv = esum - osum;
        if(iDiv < 0)
        {
            iDiv = -iDiv;
        }
        return iDiv;
    }
}
class Ass335
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("hey user enter number:");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.Substraction(iNo);

        System.out.println("Substraction of evensum and odd sum :" + iRet);

    }
}




