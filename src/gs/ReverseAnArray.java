package gs;

public class ReverseAnArray
{

    public static void main(final String[] args)
    {
        final int[] n = {1,2,3,4,5,6};
        int t=0;
        for(int i=0,j=n.length-1;i<j;i++,j--){
            t = n[j];
            n[j]=n[i];
            n[i]=t;
        }
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }

    }

}
