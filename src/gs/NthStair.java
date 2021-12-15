package gs;

public class NthStair
{
    public static int nthStairWays(final int n){
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }

        return nthStairWays(n-1)+nthStairWays(n-2);
    }
    public static void main(final String[] args)
    {
        System.out.println(nthStairWays(3));

    }

}
