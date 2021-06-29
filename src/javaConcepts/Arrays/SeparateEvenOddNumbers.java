package javaConcepts.Arrays;

public class SeparateEvenOddNumbers {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		int left=0;
		int right=0;
		
		while(left<nums.length && right<nums.length) {
			if(nums[right]%2==0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right]=temp;
				left++;
			}
			right++;
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}

	}

}
