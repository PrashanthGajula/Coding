package leetCode;

public class BestTimetoBuyandSellStock
{

    public static void main(final String[] args)
    {
        final int[] p = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<p.length;i++){
            if(p[i]<min){
                min = p[i];
            }
            if(p[i]-min>max){
                max = p[i]-min;
            }
        }
        System.out.println(max);

    }

}
