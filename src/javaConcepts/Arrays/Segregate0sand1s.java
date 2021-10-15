package javaConcepts.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Segregate0sand1s {

	public static void main(String[] args) {
		int[] nums = {1,0,1,0,1,0,1,0};
		int zero=0;
		int one =0;
		while(zero<nums.length && one < nums.length) {
			if(nums[one]==0) {
				int temp = nums[zero];
				nums[zero]=nums[one];
				nums[one] = temp;
				zero++;
			}
			one++;
		}
		List<String> li = new ArrayList<>();
		
		
		HashSet<String> set = new HashSet<>();
		
		HashMap<String, String> hm = new HashMap<>();
		
		for(int i : nums) {
			System.out.print(i);
		}
	}
}
