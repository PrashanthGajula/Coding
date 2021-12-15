package wf.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

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
        Arrays.sort(badgeEntries, (a, b) -> (Integer.valueOf(a[1]) - Integer.valueOf(b[1])));
        final HashMap<String, PriorityQueue<Integer>> hm = new HashMap<>();
        for (final String[] s : badgeEntries)
        {
            final String name = s[0];
            final int time = Integer.valueOf(s[1]);
            final PriorityQueue<Integer> entry = hm.getOrDefault(name, new PriorityQueue<Integer>());
            if (entry.isEmpty())
            {
                entry.add(time);
            }
            else if (time - entry.peek() < 100)
            {
                entry.add(time);
            }
            else if (time - entry.peek() > 100 && entry.size() < 3)
            {
                while (!entry.isEmpty() && time - entry.peek() > 100)
                {
                    entry.poll();
                }
                entry.add(time);
            }
            hm.put(name, entry);
        }
        hm.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        final Map<String, PriorityQueue<Integer>> res = hm.entrySet().stream().filter(x -> x.getValue().size() >= 3)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
        return res;
    }

}
