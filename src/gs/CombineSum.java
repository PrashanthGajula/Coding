package gs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombineSum
{

    public static void main(final String[] args)
    {
        final int target = 7;
        final int[] n = {2,3,4,5};
        final List<List<Integer>> li = new LinkedList<List<Integer>>();
        backTrack(li, new ArrayList<>(), n , target, 0);

        for(final List<Integer> l : li){
            System.out.println(l);
        }
    }

    private static void backTrack(final List<List<Integer>> li, final List<Integer> arrayList, final int[] num, final int target, final int start)
    {
        if(target<0)
        {
            return;
        }
        else if(target==0){
            li.add(new ArrayList<>(arrayList));
        }else{
            for(int i=start;i<num.length;i++){
                arrayList.add(num[i]);
                backTrack(li, arrayList, num, target-num[i], i);
                arrayList.remove(arrayList.size()-1);
            }
        }
    }

}
