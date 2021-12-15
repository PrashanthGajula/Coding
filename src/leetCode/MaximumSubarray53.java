package leetCode;

public class MaximumSubarray53
{

    public static void main(final String[] args)
    {
        final int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(final int[] nums) {
        int sum=0,c=0;
        for(int i=0;i<nums.length;i++){
            c=c+nums[i];
            if(sum<c){
                sum=c;
            }
            if(c<0){
                c=0;
            }
        }
        return sum;

    }

}
