package leetCode;

public class PairsSum
{
    public static void main(final String[] args)
    {
        final int[] arr = {1,2,3,4,5,6,7,8};
        final int sum = 6;
        getPairsCount(arr, sum);
    }
    public static void getPairsCount(final int[] arr, final int sum){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
