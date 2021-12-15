package microsoft;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array N, return true if it is possible we can pair all the numbers in the array with equal values. <br>
 * E.g N = [1, 2, 2, 1] -> true as we can pair (N[0], N[3]) and (N[1], N[2]). N = [7, 7, 7] would return false.
 * <p>
 * Link: https://leetcode.com/discuss/interview-question/398023/Microsoft-Online-Assessment-Questions/1046220
 */
public class PairNumbers
{

    public static void main(final String[] args)
    {
        final int arr[] = {1, 1, 2, 1, 2, 2, 1, 2, 3, 3};
        System.out.println(pair(arr));
    }

    private static boolean pair(final int[] arr)
    {
        if (arr.length == 0 || arr.length == 1)
        {
            return false;
        }
        final Set<Integer> set = new HashSet<>();
        for (final int i : arr)
        {
            if (!set.contains(i))
            {
                set.add(i);
            }
            else
            {
                set.remove(i);
            }
        }

        return set.isEmpty() ? true : false;
    }
}
