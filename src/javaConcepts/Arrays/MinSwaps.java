package javaConcepts.Arrays;

//Find minimum swaps required to sort an array of first N numbers.
/**
 * 6,1,3,2,4,5,7 -> swap 1
 * 5,1,3,2,4,6,7 -> swap 2
 * 4,1,3,2,5,6,7 -> swap 3
 * 2,1,3,4,5,6,7 -> swap 4
 * 1,2,3,4,5,6,7 -> swap 5
 */
public class MinSwaps {

	public static void main(String[] args) {
		int[] nums = {7,1,3,2,4,5,6};
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == i+1) continue;
			int temp = nums[i];
			nums[i]=nums[temp-1];
			nums[temp-1] = temp;
			i--;
			count++;
		}
		System.out.println(count);
	}
}
