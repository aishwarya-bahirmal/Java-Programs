import java.util.*;

class Digit
{
    public int checkThreeToSeven(int iNo)
    {
        int iDigit = 0;
        int icnt = 0;

        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                icnt++;
            }
            iNo = iNo / 10;
        }
       return icnt; 
    }
}
class Ass333
{
    public static void main(String arg[])
    {
        Scanner sobj  = new Scanner(System.in);

        System.out.println("hey user enter the num");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.checkThreeToSeven(iNo);

        System.out.println("count of digit between 3 and 7: " + iRet);

    }
}