package gs;

public class RainWaterTrapping
{

    public static void main(final String[] args)
    {
        final int[] block = {3,0,0,2,0,4};
        final int[] leftMax = new int[block.length];
        leftMax[0] = block[0];
        final int[] rightMax = new int[block.length];
        rightMax[block.length-1]=block[block.length-1];
        for(int i=1,j=block.length-2;i<block.length && j>=0;i++,j--){
            leftMax[i] = Math.max(leftMax[i-1], block[i]);
            rightMax[j] = Math.max(rightMax[j+1], block[j]);
        }
        int water = 0;
        for(int i=0;i<leftMax.length;i++){
            water += Math.min(leftMax[i], rightMax[i])-block[i];
        }
        System.out.println(water);
    }
}
