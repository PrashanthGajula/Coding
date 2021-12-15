package gs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SkyLine
{

    public static void main(final String[] args)
    {
        final int[][] buildings = new int[5][3];
        buildings[0][0] = 2;
        buildings[0][1] = 9;
        buildings[0][2] = 10;

        buildings[1][0] = 3;
        buildings[1][1] = 7;
        buildings[1][2] = 15;

        buildings[2][0] = 5;
        buildings[2][1] = 12;
        buildings[2][2] = 12;

        buildings[3][0] = 15;
        buildings[3][1] = 20;
        buildings[3][2] = 10;

        buildings[4][0] = 19;
        buildings[4][1] = 24;
        buildings[4][2] = 8;



        for(final int[] it : getSkyLine(buildings)){
            System.out.println(it[0]+ " "+it[1]);
        }
    }

    private static List<int[]> getSkyLine(final int[][] buildings)
    {
        final List<int[]> result = new ArrayList<>();
        final List<int[]> height = new LinkedList<>();

        for(final int[] i : buildings){
            height.add(new int[]{i[0], -i[2]});
            height.add(new int[]{i[1], i[2]});
        }
        Collections.sort(height, (a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });

        final Queue<Integer> q = new PriorityQueue<>((a,b)->(b-a));
        q.add(0);
        int prevHeight = 0;
        int currHeight = 0;
        for(final int[] h : height){
            if(h[1]<0){
                q.add(-h[1]);
            }else{
                q.remove(h[1]);
            }
            currHeight = q.peek();
            if(prevHeight!=currHeight){
                result.add(new int[]{h[0],currHeight});
                prevHeight = currHeight;
            }
        }
        return result;
    }

}
/*
 *
2 10
3 15
7 12
12 0
15 10
20 8
24 0
 */
