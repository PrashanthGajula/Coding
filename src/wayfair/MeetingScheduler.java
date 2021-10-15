package wayfair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeetingScheduler {

	public static void main(String[] args) {
		int[][] p1Meetings = {
	            {1230, 1300},
	            { 845,  900},
	            {1300, 1500}
	        };
	    	int[][] p2Meetings = {
	            { 800, 844},
	            { 930, 1200},
	            {1515, 1546},
	            {1600, 2300}
	        };
	        int[][] p3Meetings = {
	            { 845,  915},
	            {1515, 1545},
	            {1235, 1245}
	        };
	        int[][] p4Meetings = {
	            {   1,  5},
	            { 844, 900},
	            {1515, 1600}
	        };

	        List<int[][]> schedules1 = Arrays.asList(p1Meetings, p2Meetings, p3Meetings);
	        List<int[][]> schedules2 = Arrays.asList(p1Meetings, p3Meetings);
	        List<int[][]> schedules3 = Arrays.asList(p2Meetings, p4Meetings);
	        
	         List<int[]> output = findFreeTime(schedules1);
	         
	         for(int[] array: output) {
	             System.out.println(Arrays.toString(array));
	         }

	}

	private static List<int[]> findFreeTime(List<int[][]> schedules) {
		
		List<int[]> li = new ArrayList<>();
		for(int[][] schedule : schedules) {
			for(int[] s : schedule) {
				li.add(s);
			}
		}
		
		//Merge intervals
		li = mergeIntervals(li);
		
		
		//for(int[] i : li) {
		//	System.out.println(i[0] + "-" +i[1]);
		//}
		
		int[] prev = li.get(0);
		int[] curr=null;
		
		List<int[]> res = new ArrayList<>();
		
		if(prev[0] > 0) {
			res.add(new int[] {0,prev[0]});
		}

		//find free time.
		for(int i=0;i<li.size();i++) {
			curr = li.get(i);
			if(prev[1]<curr[0]) {
				res.add(new int[] {prev[1], curr[0]});
				prev=curr;
			}
		}
		
		if(curr[1] < 2400) {
			res.add(new int[] {curr[1], 2400});
		}
		return res;
	}
	
	private static List<int[]> mergeIntervals(List<int[]> li){
		Collections.sort(li, (a,b)->(a[0]-b[0]));
		List<int[]> res = new ArrayList<>();
		
		int[] temp = li.get(0);
		for(int i=1;i<li.size();i++) {
			int[] curr = li.get(i);
			if(temp[1]<curr[0]) {
				res.add(temp);
				temp=curr;
			}else {
				temp[1] = Math.max(temp[1], curr[1]);
			}
		}
		res.add(temp);
		
		return res;
	}

}
