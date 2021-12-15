package wayfair;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given an array of meeting time intervals consisting of start and end times [s1, e1], [s2, e2], ... , determine if a person could attend all
 * meetings.
 * <p>
 * For example, <br>
 * Given [ [0, 30], [5, 10], [15, 20] ], return false.
 * <p>
 * URL: https://www.programcreek.com/2014/07/leetcode-meeting-rooms-java/
 */
public class MeetingRooms
{

    public static void main(final String[] args)
    {
        final Interval i1 = new Interval(0, 5);
        final Interval i2 = new Interval(5, 10);
        final Interval i3 = new Interval(15, 20);
        final Interval[] interval = new Interval[3];
        interval[0] = i1;
        interval[1] = i2;
        interval[2] = i3;

        System.out.println(canAttendMeetings(interval));
    }

    public static boolean canAttendMeetings(final Interval[] intervals)
    {
        Arrays.sort(intervals, new Comparator<Interval>()
        {
            @Override
            public int compare(final Interval a, final Interval b)
            {
                return a.startTime - b.startTime;
            }
        });

        for (int i = 0; i < intervals.length - 1; i++)
        {
            if (intervals[i].endTime > intervals[i + 1].startTime)
            {
                return false;
            }
        }

        return true;
    }

    public static class Interval
    {
        int startTime;
        int endTime;

        Interval(final int startTime, final int endTime)
        {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

}
