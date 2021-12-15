package leetCode;

import java.util.HashMap;

public class CountPairsWithGivenSum
{

    public static void main(final String[] args)
    {
        final int[] n = {1,5,7,-1,5};
        final int sum = 6;
        final HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<n.length;i++){
            if(!hm.containsKey(n[i])){
                hm.put(n[i], 0);
            }
            hm.put(n[i], hm.get(n[i])+1);

        }

        int counter = 0;
        final HashMap<Integer, Integer> hm2 = new HashMap<>();
        for(int i=0;i<n.length;i++){
            if((sum-n[i]!=n[i]) && hm.containsKey(sum-n[i])){
                counter = counter+hm.get(sum-n[i]);
                hm2.put(n[i], sum-n[i]);
                System.out.println(n[i] +":"+(sum-n[i]));
            }
        }
        System.out.println(counter/2);

    }

}
