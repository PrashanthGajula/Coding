package javaConcepts.Arrays;

public class RiverRecords_MaxTrailing {

	public static void main(String[] args) {
		int[] nums = {5,3,6,7,4};
		
		int max = Integer.MIN_VALUE;
		int min = nums[0];
		
		for(int i=0;i<nums.length;i++) {
			max = Math.max(max, nums[i]-min);
			min = Math.min(min, nums[i]);
		}
		max = max==0?-1:max;
		System.out.println(max);

	}

}
