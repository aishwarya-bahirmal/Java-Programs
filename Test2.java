public class Test2
{
    public static void main(String[] args)
    {
        String s = "abcd45dfcH45ab";

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
            {
                System.out.println(c);
            }
        }
    }
}