package wayfair;

/**
 * https://leetcode.com/discuss/interview-question/416343/Wayfair-OA/811566
 * <p>
 * Q1: Given a string, you have to insert 'a' into it, subject to the condition that the string cannot contain 3 consecutive a's.<br>
 * Return the maximum number of a's that can be inserted. For eg: dog: return 8, as you can make aadaaoaagaa.
 */
public class MaxNosOfAsThatcanbeInserted
{
    public static void main(final String[] args)
    {
        final String s = "Dog";
        int aCount = 0;
        int nonACount = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A')
            {
                aCount++;
            }
            else
            {
                nonACount++;
            }
        }

        final int count = (nonACount * 2 + 2) - aCount;
        System.out.println(count);

    }

}
