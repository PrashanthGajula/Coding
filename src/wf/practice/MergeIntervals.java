package wf.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    private static List<Interval> merge(final List<Interval> intervals)
    {
        if (intervals == null || intervals.size() <= 1)
        {
            return intervals;
        }
        final List<Interval> res = new ArrayList<>();
        Collections.sort(intervals, (a, b) -> (a.start - b.start));
        Interval prev = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++)
        {
            final Interval curr = intervals.get(i);
            if (prev.end < curr.start)
            {
                res.add(prev);
                prev = curr;
            }
            else
            {
                prev.end = Math.max(prev.end, curr.end);
            }
        }
        res.add(prev);
        return res;
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
