package wayfair;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * URL: https://www.programcreek.com/2014/05/leetcode-meeting-rooms-ii-java/
 * <p>
 * Time: O(Nlog(N))
 */
public class MeetingRooms11
{
    public static void main(final String[] args)
    {
        final Interval i1 = new Interval(0, 30);
        final Interval i2 = new Interval(5, 10);
        final Interval i3 = new Interval(15, 20);
        final Interval[] interval = new Interval[3];
        interval[0] = i1;
        interval[1] = i2;
        interval[2] = i3;

        System.out.println(minMeetingRooms(interval));
    }

    private static int minMeetingRooms(final Interval[] intervals)
    {
        Arrays.sort(intervals, (a, b) -> (a.start - b.start));
        final PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;
        for (final Interval i : intervals)
        {
            if (heap.isEmpty())
            {
                count++;
                heap.offer(i.end);
            }
            else
            {
                if (i.start >= heap.peek())
                {
                    heap.poll();
                }
                else
                {
                    count++;
                }
                heap.offer(i.end);
            }
        }

        return count;
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
