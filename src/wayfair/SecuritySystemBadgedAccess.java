package wayfair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * We are working on a security system for a badged-access room in our company's building.
 * <p>
 * We want to find employees who badged into our secured room unusually often. We have an unordered list of names and entry times over a single day.
 * Access times are given as numbers up to four digits in length using 24-hour time, such as "800" or "2250".
 * <p>
 * Write a function that finds anyone who badged into the room three or more times in a one-hour period. Your function should return each of the
 * employees who fit that criteria, plus the times that they badged in during the one-hour period. If there are multiple one-hour periods where this
 * was true for an employee, just return the first one.
 * <p>
 * https://leetcode.com/discuss/interview-question/1379389/Wayfair-Karat
 * <p>
 * Time: O(nlogn).
 */
public class SecuritySystemBadgedAccess
{

    public static void main(final String[] args)
    {
        final String[][] badge_times = {{"Paul", "1355"}, {"Jennifer", "1910"}, {"John", "835"}, {"John", "830"}, {"Paul", "1315"}, {"John", "1615"},
                {"John", "1640"}, {"Paul", "1405"}, {"John", "855"}, {"John", "930"}, {"John", "915"}, {"John", "730"}, {"John", "940"},
                {"Jennifer", "1335"}, {"Jennifer", "730"}, {"John", "1630"}, {"Jennifer", "5"}};

        final Map<String, PriorityQueue<Integer>> result = detectUnusualEntries(badge_times);
        System.out.println(result);
    }

    private static Map<String, PriorityQueue<Integer>> detectUnusualEntries(final String[][] badgeEntries)
    {
        // Sort the given entries according to entry times.
        Arrays.sort(badgeEntries, (a, b) -> (Integer.valueOf(a[1]) - Integer.valueOf(b[1])));

        final Map<String, PriorityQueue<Integer>> entryByPerson = new HashMap<String, PriorityQueue<Integer>>();

        for (final String[] s : badgeEntries)
        {
            final String name = s[0];
            final int currentEntry = Integer.valueOf(s[1]);

            final PriorityQueue<Integer> entries = entryByPerson.getOrDefault(name, new PriorityQueue<Integer>((a, b) -> Integer.compare(a, b)));

            if (entries.isEmpty() || currentEntry - entries.peek() < 100)
            {
                entries.add(currentEntry);
            }
            else if (currentEntry - entries.peek() > 100 && entries.size() < 3)
            {
                while (!entries.isEmpty() && currentEntry - entries.peek() > 100)
                {
                    entries.poll();
                }
                entries.add(currentEntry);
            }
            entryByPerson.put(name, entries);
        }

        // filtering the queue by its size greater than 2 -- for badge times greater than 3 or more
        final Map<String, PriorityQueue<Integer>> pq = entryByPerson.entrySet().stream().filter(entries -> entries.getValue().size() >= 3)
                .collect(Collectors.toMap(entries -> entries.getKey(), entries -> entries.getValue()));
        return pq;
    }

}
