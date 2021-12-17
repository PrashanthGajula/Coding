package microsoft;

/**
 * Write a function solution that, given a three-digit integer N and an integer K, returns the maximum possible three-digit value that can be obtained
 * by performing at most K increases by 1 of any digit in N. <br>
 * <br>
 * Examples: <br>
 * Given N = 512 and K =10, the function should return 972. The result can be obtained by increasing the first digit of N four times and the second
 * digit six times. <br>
 * Given N = 191 and K = 4, the function should return 591. The result can be obtained by increasing the first digit of N four times. <br>
 * Given N = 285 and K = 20, the function should return 999. The result can be obtained by increasing the first digit of N seven times, the second
 * digit once and the third digit four times.<br>
 * <br>
 * Assume that: <br>
 * • N is an integer within the range [100..999] <br>
 * • K is an integer within the range [0..30].
 */
public class MaximumPossibleThreeDigitValue
{

    public static void main(final String[] args)
    {
        // final int result = maxThreeDigit(512, 10);// 972
        // final int result = maxThreeDigit(191, 4);// 591
        final int result = maxThreeDigit(191, 20);// 999
        System.out.println(result);

    }

    private static int maxThreeDigit(final int num, final int k)
    {
        int res = num;
        for (int i = 0; i < k; i++)
        {
            if (res == 999)
            {
                break;
            }
            else if (res / 100 < 9)
            {
                res = res + 100;
            }
            else if (res / 10 < 99)
            {
                res = res + 10;
            }
            else if (res / 1 < 999)
            {
                res = res + 1;
            }

        }
        return res;
    }
}
