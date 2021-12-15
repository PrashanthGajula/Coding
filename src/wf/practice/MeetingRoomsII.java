package wf.practice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII
{

    public static void main(final String[] args)
    {
        final Interval i1 = new Interval(0, 30);
        final Interval i2 = new Interval(5, 15);
        final Interval i3 = new Interval(15, 20);
        final Interval[] interval = new Interval[3];
        interval[0] = i1;
        interval[1] = i2;
        interval[2] = i3;

        System.out.println(minMeetingRooms(interval));

    }

    private static int minMeetingRooms(final Interval[] interval)
    {
        Arrays.sort(interval, (a, b) -> (a.start - b.start));
        final PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (final Interval i : interval)
        {
            if (pq.isEmpty())
            {
                pq.offer(i.end);
            }
            else
            {
                if (i.start >= pq.peek())
                {
                    pq.poll();
                }
                pq.offer(i.end);
            }
        }
        return pq.size();
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
