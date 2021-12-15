package wayfair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/discuss/interview-question/1046812/Wayfair-or-OA-(Karat)-or-Manage-CalendarMeeting-Scheduler
 */
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

    private static ArrayList<ArrayList<Integer>> findSchedules(final List<int[][]> schedules)
    {
        final ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        final ArrayList<ArrayList<Integer>> sortedSchedules = new ArrayList<ArrayList<Integer>>();
        for (final int[][] schedule : schedules)
        {
            for (final int[] subSchedule : schedule)
            {
                final ArrayList<Integer> s = new ArrayList<Integer>();
                s.add(subSchedule[0]);
                s.add(subSchedule[1]);
                sortedSchedules.add(s);
            }
        }

        // sort the list according to the start times.
        Collections.sort(sortedSchedules, (a, b) -> a.get(0) - b.get(0));
        System.out.println(sortedSchedules);

        int end = sortedSchedules.get(0).get(1);

        for (int i = 1; i < sortedSchedules.size(); i++)
        {
            final List<Integer> schedule = sortedSchedules.get(i);
            if (schedule.get(0) > end)
            {
                final List<Integer> availability = new ArrayList<Integer>();
                availability.add(end);
                availability.add(schedule.get(0));
                end = schedule.get(1);
                result.add((ArrayList<Integer>) availability);
            }
            else
            {
                end = Math.max(end, schedule.get(1));
            }
        }

        return result;
    }

}
