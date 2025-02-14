import java.util.*;

class Digit
{
    public int MultilpicationOfDigits(int iNo)
    {
        int iDigit = 0;
        int iMult = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                iDigit = 1;
            }
            iMult = iMult * iDigit;
            iNo = iNo / 10;
            
        }
        return iMult;
    }
}
class Ass334
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Hey enter num");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.MultilpicationOfDigits(iNo);

        System.out.println("Multiplication is :" + iRet);
    }
}