package wayfair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class SecuritySystemBadgedAccess11
{

    public static void main(final String[] args)
    {
        final String[] keyName = {"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"};
        final String[] keyTime = {"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"};

        // final String[] keyName = {"john", "john", "john"};
        // final String[] keyTime = {"23:58", "23:59", "00:01"};

        System.out.println(alertNames2(keyName, keyTime));

    }

    private static List<String> alertNames2(final String[] keyName, final String[] keyTime)
    {
        final HashMap<String, List<Integer>> hm = new HashMap<String, List<Integer>>();

        for (int i = 0; i < keyName.length; i++)
        {
            hm.putIfAbsent(keyName[i], new ArrayList<Integer>());
            final String[] t = keyTime[i].split(":");
            final int time = Integer.valueOf(t[0]) * 60 + Integer.valueOf(t[1]);
            hm.get(keyName[i]).add(time);
        }

        return hm.entrySet().stream().filter(x -> hasMoreThanThree(x.getValue())).map(x -> x.getKey()).sorted().collect(Collectors.toList());
    }

    private static boolean hasMoreThanThree(final List<Integer> li)
    {
        Collections.sort(li);

        for (int i = 2; i < li.size(); i++)
        {
            if (li.get(i) - li.get(i - 2) <= 60)
            {
                return true;
            }
        }
        return false;

    }

    private static List<String> alertNames(final String[] keyName, final String[] keyTime)
    {
        final HashMap<String, PriorityQueue<Integer>> hm = new HashMap<>();

        for (int i = 0; i < keyName.length; i++)
        {
            final PriorityQueue<Integer> pq = hm.getOrDefault(keyName[i], new PriorityQueue<Integer>((a, b) -> Integer.compare(a, b)));
            final String[] kt = keyTime[i].split(":");
            final int time = Integer.valueOf(kt[0] + kt[1]);

            if (pq.isEmpty())
            {
                pq.add(time);
            }
            else if (time - pq.peek() < 100)
            {
                pq.add(time);
            }
            else if (time - pq.peek() >= 100 && pq.size() < 3)
            {
                while (!pq.isEmpty() && time - pq.peek() > 100)
                {
                    pq.poll();
                }
                pq.add(time);
            }
            hm.put(keyName[i], pq);
        }
        System.out.println(hm);

        final Map<String, PriorityQueue<Integer>> res = hm.entrySet().stream().filter(x -> x.getValue().size() >= 3)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
        final List<String> li = new ArrayList<String>();
        li.addAll(res.keySet());

        return li;
    }

}
