package wayfair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.programcreek.com/2012/12/leetcode-merge-intervals/
 */
public class MergeIntervals
{

    public static void main(final String[] args)
    {
        final Interval i1 = new Interval(1, 3);
        final Interval i2 = new Interval(2, 6);
        final Interval i3 = new Interval(8, 10);
        final Interval i4 = new Interval(15, 18);
        final List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        intervals.add(i4);

        for (final Interval i : merge(intervals))
        {
            System.out.println(i.start + " - " + i.end);
        }
    }

    public static List<Interval> merge(final List<Interval> intervals)
    {
        if (intervals == null || intervals.size() <= 1)
        {
            return intervals;
        }

        Collections.sort(intervals, (a, b) -> (a.start - b.start));
        final List<Interval> result = new ArrayList<Interval>();

        Interval t = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++)
        {
            final Interval c = intervals.get(i);
            if (t.end < c.start)
            {
                result.add(t);
                t = c;
            }
            else
            {
                t.end = Math.max(t.end, c.end);
            }
        }
        result.add(t);
        return result;
    }

    public static class Interval
    {
        int start;
        int end;

        Interval(final int start, final int end)
        {
            this.start = start;
            this.end = end;
        }
    }

}
