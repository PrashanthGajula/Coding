package microsoft;

/**
 * find_min function is implemented wrongly (the function was implemented to always return 0), <br>
 * write a function to return a counter example array of size n that when passed to find_min will always return a wrong answer.<br>
 * E.g n = 4, [100, 500, 200, 300].
 */
public class CounterExample
{

    public static void main(final String[] args)
    {
        // TODO Auto-generated method stub

    }

    public int[] counterExample(final int n)
    {
        final int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++)
        {
            result[i - 1] = i;
        }
        return result;

    }

}
