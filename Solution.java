class Solution
{
    int n;
    int rev=0;

    public Solution(int x)
    {
        n=x;
    }

    public boolean checkPal()
    {
        if(n<0)
        {
            return false;
        }
        while(n>0)
        {
           int ld = n%10;

           rev = rev*10+ld;

           n = n/10;
        }
        if(rev == x)
        {
            return true;
        }
                return false;

        }
    public static void main(String[] args)
        {
            Solution s = new Solution(121);
            s.checkPal();
        }
}