package wayfair;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class BadgedAccess {

	public static void main(String[] args) {
		String[][] badgeTimes = {
					{"Paul", "1355"},
					{"Jennifer", "1910"},
					{"John", "830"},
					{"Paul", "1315"},
					{"John", "1615"},
					{"John", "1640"},
					{"John", "835"},
					{"Paul", "1405"},
					{"John", "855"},
					{"John", "930"},
					{"John", "915"},
					{"John", "730"},
					{"Jennifer", "1335"},
					{"Jennifer", "730"},
					{"John", "1630"}
				};

		Map<String, PriorityQueue<Integer>> hm = detectUnusualEntries(badgeTimes);
		System.out.println(hm);
	}

	private static Map<String, PriorityQueue<Integer>> detectUnusualEntries(String[][] badgeTimes) {
		Arrays.sort(badgeTimes, (a,b) -> (Integer.valueOf(a[1])- Integer.valueOf(b[1])));
		Map<String, PriorityQueue<Integer>> hm = new HashMap<>();
		
		for(String[] bt : badgeTimes) {
			String name = bt[0];
			Integer time = Integer.valueOf(bt[1]);
			PriorityQueue<Integer> entries = hm.getOrDefault(name, new PriorityQueue<>());
			
			if(entries.isEmpty()) {
				entries.add(time);
			} else if(time - entries.peek() < 100) {
				entries.add(time);
			} else if(time-entries.peek() > 100 && entries.size() < 3) {
				while(!entries.isEmpty() && time-entries.peek()>100) {
					entries.poll();
				}
				entries.add(time);
			}
			hm.put(name, entries);
		}
		
		Map<String, PriorityQueue<Integer>> res = hm.entrySet().stream().filter(x->x.getValue().size() >=2 ).collect(Collectors.toMap(x->x.getKey(), x->x.getValue()));
		
		return res;
	}

}
