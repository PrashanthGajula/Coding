package microsoft;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode.com/discuss/interview-question/406031/Microsoft-or-OA-2019-or-Largest-K-such-that-both-K-and-K-exist-in-array/364810
 */
public class LargestKsuchThatbothKandNegativeKexistinarray
{

    public static void main(final String[] args)
    {
        final int[] nums1 = {3, 2, -2, 5, -3};
        final int[] nums2 = {1, 2, 3, -4};
        final int[] nums3 = {-41, 3, 2, 5, 41};
        System.out.println(largestNum(nums1));
        System.out.println(largestNum(nums2));
        System.out.println(largestNum(nums3));

        System.out.println(largestNumber(nums1));
        System.out.println(largestNumber(nums2));
        System.out.println(largestNumber(nums3));
    }

    private static int largestNum(final int[] nums)
    {
        final Set<Integer> set = new HashSet<Integer>();
        int res = 0;
        for (final int i : nums)
        {
            set.add(i);
            if (set.contains(i * -1))
            {
                res = Math.max(res, Math.abs(i));
            }
        }
        return res;
    }

    private static int largestNumber(final int[] nums)
    {
        int res = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right)
        {
            final int sum = nums[left] + nums[right];
            if (sum == 0)
            {
                res = Math.max(res, nums[right]);
                left++;
                right--;
            }
            else if (sum < 0)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return res;
    }

}
