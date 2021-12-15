package wf.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeetingScheduler
{

    public static void main(final String[] args)
    {
        final int[][] p1Meetings = {{1230, 1300}, {845, 900}, {1300, 1500}};
        final int[][] p2Meetings = {{0, 844}, {930, 1200}, {1515, 1546}, {1600, 2400}};
        final int[][] p3Meetings = {{845, 915}, {1515, 1545}, {1235, 1245}};
        final int[][] p4Meetings = {{1, 5}, {844, 900}, {1515, 1600}};

        final List<int[][]> schedules1 = Arrays.asList(p1Meetings, p2Meetings, p3Meetings);
        final List<int[][]> schedules2 = Arrays.asList(p1Meetings, p3Meetings);
        final List<int[][]> schedules3 = Arrays.asList(p2Meetings, p4Meetings);

        System.out.println(findSchedules(schedules1));
    }

    private static List<List<Integer>> findSchedules(final List<int[][]> schedules)
    {
        List<int[]> ml = new ArrayList<int[]>();
        for (final int[][] ls : schedules)
        {
            for (final int[] li : ls)
            {
                ml.add(li);
            }
        }
        Collections.sort(ml, (a, b) -> (a[0] - b[0]));

        ml = mergeIntervals(ml);
        ml.forEach(x -> System.out.println(x[0] + " " + x[1]));

        final List<List<Integer>> res = new ArrayList<List<Integer>>();
        // find free time
        for (int i = 0; i < ml.size() - 1; i++)
        {
            if (ml.get(i)[1] < ml.get(i + 1)[0])
            {
                final List<Integer> tl = new ArrayList<Integer>();
                tl.add(ml.get(i)[1]);
                tl.add(ml.get(i + 1)[0]);
                res.add(tl);
            }

        }
        return res;
    }

    private static List<int[]> mergeIntervals(final List<int[]> ml)
    {
        int[] prev = ml.get(0);
        final List<int[]> res = new ArrayList<int[]>();
        for (int i = 1; i < ml.size(); i++)
        {
            final int[] curr = ml.get(i);
            if (prev[1] < curr[0])
            {
                res.add(prev);
                prev = curr;
            }
            else
            {
                prev[1] = Math.max(prev[1], curr[1]);
            }
        }
        res.add(prev);
        return res;
    }
}
