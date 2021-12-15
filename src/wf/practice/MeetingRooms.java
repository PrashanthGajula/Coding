package wf.practice;

import java.util.Arrays;

public class MeetingRooms
{

    public static void main(final String[] args)
    {
        final Interval i1 = new Interval(0, 5);
        final Interval i2 = new Interval(5, 10);
        final Interval i3 = new Interval(14, 20);
        final Interval[] interval = new Interval[3];
        interval[0] = i1;
        interval[1] = i2;
        interval[2] = i3;

        System.out.println(canAttendMeetings(interval));
    }

    private static boolean canAttendMeetings(final Interval[] interval)
    {
        Arrays.sort(interval, (a, b) -> (a.startTime - b.startTime));

        for (int i = 0; i < interval.length - 1; i++)
        {
            if (interval[i].endTime > interval[i + 1].startTime)
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
