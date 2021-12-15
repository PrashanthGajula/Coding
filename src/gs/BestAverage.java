package gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BestAverage
{

    public static void main(final String[] args)
    {
        final String[][] scores = {{"Bob", "8"}, {"chris", "65"}, {"Matt", "50"}, {"Bob", "100"}};
        final HashMap<String, List<Integer>> hm = new HashMap<>();
 int bestAvg = 0;
int newAvg=0;
        for(final String[] s : scores){
            if(hm.containsKey(s[0])){
                 final int mark = hm.get(s[0]).get(0);
                int count = hm.get(s[0]).get(1);count++;
                newAvg = (mark + Integer.parseInt(s[1]))/count;
                hm.get(s[0]).set(0, newAvg);
                hm.get(s[0]).set(1, count);
            } else {
                final List<Integer> newL = new ArrayList<>();
                newL.add(Integer.parseInt(s[1]));
                newL.add(1);
                hm.put(s[0], newL);
                newAvg = Integer.parseInt(s[1]);
            }

            if(newAvg>bestAvg){
                bestAvg=newAvg;
            }
        }
System.out.println(bestAvg);
    }

}
