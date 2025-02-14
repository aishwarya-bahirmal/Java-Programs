public class Test8
{
    public static void main(String[] args)
    {
        String s ="abcd45fdcH45ab";
        int sum =0;

        for(int i=0; i<s.length(); i++)
        {
            char c =s.charAt(i);

            if(Character.isDigit(c))
            {
                sum += Character.getNumericValue(c);
            }
        }

        System.out.println("sum of digits:"+sum);
    }
}