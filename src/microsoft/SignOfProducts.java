package microsoft;

/**
 * Find Sign of product of all element in an array multiplied Together.<br>
 * E.g: given an array like [-2,3,5,-9], return 1,0 or -1 if the product of all elements in the array is positive, 0 or negative respectively.
 */
public class SignOfProducts
{

    public static void main(final String[] args)
    {
        final int[] nums = {-2, 3, 5, -9};
        System.out.println(signOfProducts(nums));
    }

    private static int signOfProducts(final int[] nums)
    {
        if (nums.length == 0)
        {
            return 0;
        }
        int count = 0;
        for (final int i : nums)
        {
            if (i < 0)
            {
                count++;
            }
        }
        return count % 2 == 0 ? 1 : 0;
    }

}
