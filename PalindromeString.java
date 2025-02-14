class PalindromeString
{
    public static void main(String[] args)
    {
        String a ="Aishwarya";
        String rev = "";

        for(int i=a.length()-1; i>=0; i--)
        {
            rev = rev+a.charAt(i);
        }
            if(a.equals(rev))
            {
                System.out.println("String is palindrome");
            }
            else
            {
                System.out.println("String is not palindrome");
            }
        
    }
}