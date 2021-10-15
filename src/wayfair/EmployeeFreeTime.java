package wayfair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeFreeTime {

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

	private static List<int[]> findFreeTime(List<int[][]> schedules1) {
		List<int[]> li = new ArrayList<>();
		
		for(int[][] x : schedules1) {
			for(int[] xi : x) {
				li.add(xi);
			}
		}
		Collections.sort(li, (a,b) -> (a[0]-b[0]));
		
		li = merge(li);
		li.forEach(x -> System.out.println(x[0]+" "+x[1]));
		
		//find free time.
		List<int[]> res = new ArrayList<>();
		for(int i=1;i<li.size();i++) {
			if(li.get(i-1)[1] < li.get(i)[0]) {
				res.add(new int[] {li.get(i-1)[1], li.get(i)[0]});
			}
		}
		
		return res;
		
	}
	private static List<int[]> merge(List<int[]> li){
		int[] prev = li.get(0);
		List<int[]> ml  = new ArrayList<>();
		
		for(int i=1;i<li.size();i++) {
			int[] curr = li.get(i);
			
			if(prev[1] < curr[0]) {
				ml.add(prev);
				prev=curr;
			}else {
				prev[1] = Math.max(prev[1], curr[1]);
			}
		}
		ml.add(prev);
		return ml;
	}

}
