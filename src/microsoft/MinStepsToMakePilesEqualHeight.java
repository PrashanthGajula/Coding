package microsoft;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://leetcode.com/discuss/interview-question/364618/Microsoft-or-OA-2019-or-Min-Steps-to-Make-Piles-Equal-Height/357075
 */
public class MinStepsToMakePilesEqualHeight
{

    public static void main(final String[] args)
    {
        System.out.println(step(new Integer[] {5, 2, 1}));
        System.out.println(step(new Integer[] {4, 5, 5, 4, 2}));
    }

    private static int step(final Integer[] num)
    {
        if (num == null || num.length == 0)
        {
            return 0;
        }
        int steps = 0;
        Arrays.sort(num, Collections.reverseOrder());

        for (int i = 1; i < num.length; i++)
        {
            if (num[i] < num[i - 1])
            {
                steps = steps + i;
            }
        }
        return steps;
    }

}
