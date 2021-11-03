package wayfair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
We are working on a security system for a badged-access room in our company's building.

Given an ordered list of employees who used their badge to enter or exit the room, write a function that returns two collections:

1. All employees who didn't use their badge while exiting the room - they recorded an enter without a matching exit. (All employees are required to leave the room before the log ends.)

2. All employees who didn't use their badge while entering the room - they recorded an exit without a matching enter. (The room is empty when the log begins.)

Each collection should contain no duplicates, regardless of how many times a given employee matches the criteria for belonging to it.

badge_records_1 = [
  ["Martha",   "exit"],
  ["Paul",     "enter"],
  ["Martha",   "enter"],
  ["Steve",    "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "enter"],
  ["Paul",     "enter"],
  ["Curtis",   "exit"],
  ["Curtis",   "enter"],
  ["Paul",     "exit"],
  ["Martha",   "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "exit"],
  ["Paul",     "enter"],
  ["Paul",     "enter"],
  ["Martha",   "exit"],
  ["Paul",     "enter"],
  ["Paul",     "enter"],
  ["Paul",     "exit"],
  ["Paul",     "exit"] 
]

Expected output: ["Paul", "Curtis", "Steve"], ["Martha", "Curtis", "Paul"]

Other test cases:

badge_records_2 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
]

Expected output: [], []

badge_records_3 = [
  ["Paul", "enter"],
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
]

Expected output: ["Paul"], ["Paul"]

badge_records_4 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
  ["Paul", "enter"],
]

Expected output: ["Paul"], ["Paul"]

n: length of the badge records array


*/

public class KaratRedo {

	public static void main(String[] args) {
		
	    String badgeRecords1[][] = new String[][] {
	        {"Martha",   "exit"},
	        {"Paul",     "enter"},
	        {"Martha",   "enter"},
	        {"Steve",    "enter"},
	        {"Martha",   "exit"},
	        {"Jennifer", "enter"},
	        {"Paul",     "enter"},
	        {"Curtis",   "exit"},
	        {"Curtis",   "enter"},
	        {"Paul",     "exit"},
	        {"Martha",   "enter"},
	        {"Martha",   "exit"},
	        {"Jennifer", "exit"},
	        {"Paul",     "enter"},
	        {"Paul",     "enter"},
	        {"Martha",   "exit"},
	        {"Paul",     "enter"},
	        {"Paul",     "enter"},
	        {"Paul",     "exit"},
	        {"Paul",     "exit"} 
	      };
	      
	      HashMap<String, List<String>> hm = findViolations(badgeRecords1);
	      System.out.println(hm);

	}

	private static HashMap<String, List<String>> findViolations(String[][] badgeRecords1) {
		HashMap<String, List<String>> hm = new HashMap<>();
		for(String[] s: badgeRecords1) {
			hm.putIfAbsent(s[0], new ArrayList<>());
			hm.get(s[0]).add(s[1]);
		}
		
		System.out.println(hm);
		HashMap<String, List<String>> res = new HashMap<>();
		res.putIfAbsent("enter", new ArrayList<>());
		res.putIfAbsent("exit", new ArrayList<>());
		
		for(Map.Entry<String, List<String>> entry : hm.entrySet()) {
			String name = entry.getKey();
			List<String> li = entry.getValue();
			if(li.size()==1) {
				if(li.get(0)=="exit") {
					if(!res.get("enter").contains(name)) {
						res.get("enter").add(name);
					}
				}else if(li.get(0)=="enter") {
					if(!res.get("exit").contains(name)) {
						res.get("exit").add(name);
					}
				}
			}
			
			String prev = li.get(0);
			if(prev=="exit") {
				res.get("enter").add(name);
			}
			
			for(int i=1;i<li.size();i++) {
				String curr = li.get(i);
				if(prev==curr) {
					if(prev=="enter") {
						if(!res.get("exit").contains(name)) {
							res.get("exit").add(name);
						}
					}else if(prev=="exit") {
						if(!res.get("enter").contains(name)) {
							res.get("enter").add(name);
						}
					}
					
				}
				prev=curr;
			}
			if(li.get(li.size()-1) == "enter") {
				if(!res.get("exit").contains(name)) {
					res.get("exit").add(name);
				}
			}
			
		}
		return res;
	}

}
