package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber_179
{
    public static void main(final String[] args)
    {
        final int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
        //System.out.println("3".compareTo("30"));
    }
    public static String largestNumber(final int[] nums){
        final String[] s_nums = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s_nums[i]=String.valueOf(nums[i]);
        }

        final Comparator<String> comp = new Comparator<String>()
        {
            @Override
            public int compare(final String o1, final String o2)
            {
                //-1 * Sort in ascending order
                return -1*(o1+o2).compareTo(o2+o1);
            }
        };

        Arrays.sort(s_nums, comp);
        final StringBuilder sb = new StringBuilder();
        for(int i=0;i<s_nums.length;i++){
            sb.append(s_nums[i]);
        }

        return sb.toString();
    }
}
