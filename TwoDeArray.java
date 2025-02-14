class TwoDeArray
{
    public static void main(String[] args)
    {
        int[][] a = {{10,20},{30,50,60}};

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}