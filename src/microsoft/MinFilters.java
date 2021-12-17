package microsoft;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/discuss/interview-question/1595274/Microsoft-or-Online-Assessment-or-Questions<br>
 * A company has N factories, each producing some pollution every month. The company has decided to reduce its total fume emissions by equipping some
 * of the factories with one or more filters. <br>
 * Every such filter reduces the pollution of a factory by half. When a second (or subsequent) filter is applied, it again reduces by half the
 * remaining pollution emitted after fitting the existing filter(s). <br>
 * For example, a factory that initially produces 6 units of pollution will generate 3 units with one filter, 1.5 units with two filters and 0.75
 * units with three filters. <br>
 * You are given an array of N integers describing the amount of pollution produced by the factories. Your task is to find the minimum number of
 * filters needed to decrease the total sum of pollution by at least half. <br>
 * Write a function: <br>
 * class Solution { public int solution(int[] A); } which, given an array of integers A of length N, returns the minimum number of filters needed to
 * reduce the total pollution by at least half. <br>
 * Example: 1. Given A = [5, 19, 8, 1], your function should return 3. The initial total pollution is 5 + 19 + 8 + 1 = 33. We install two filters at
 * the factory producing 19 units and one filter at the factory producing 8 units. Then the total pollution will be 5 + ((19 / 2)/ 2) + (8 / 2) + 1 =
 * 5 + 4.75 + 4 + 1 = 14.75 which is less than 33 / 2 = 16.5, so we have achieved our goal. <br>
 * Example: 2. Given A = [10, 10], your function should return 2, because we may install one filter at each factory. Write an efficient algorithm.
 */
public class MinFilters
{

    public static void main(final String[] args)
    {
        // final int[] arr = {5, 19, 8, 1};
        final int[] arr = {10, 10};
        System.out.println(minFilters(arr));
    }

    public static int minFilters(final int[] arr)
    {
        double total = 0.0;
        int count = 0;
        final PriorityQueue<Double> pq = new PriorityQueue<Double>((a, b) -> Double.compare(b, a));// Descending Order

        for (final int i : arr)
        {
            total = total + i;
            pq.offer((double) i);
        }
        final double target = total / 2;

        while (!pq.isEmpty() && total > target)
        {
            final double temp = pq.poll();
            total = total - temp;
            total = total + temp / 2;
            count++;
            pq.offer(temp / 2);
        }

        return count;
    }
}
