package javaConcepts.Arrays;

import java.util.Arrays;

public class FirstDigitSort {

	public static void main(String[] args) {
		int[] nums = {9,89,111,56,32};
		
		String[] str = new String[nums.length];
		for(int i=0;i<nums.length;i++) {
			str[i]=Integer.toString(nums[i]);
		}
		Arrays.sort(str);
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=Integer.parseInt(str[i]);
			System.out.print(nums[i] + " ");
		}

	}

}
