package javaConcepts.Arrays;

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
		
		for(int i : nums) {
			System.out.print(i);
		}

	}
}
