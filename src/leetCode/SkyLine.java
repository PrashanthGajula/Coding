package leetCode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class SkyLine
{
    public static List<int[]> getSkyLine(final int[][] buildings){
        final List<int[]> ret = new LinkedList<>();
        final List<int[]> height = new LinkedList<>();

        for(final int[] h:buildings){
            height.add(new int[]{h[0],-h[2]});
            height.add(new int[]{h[1], h[2]});
        }
        //Ascending Order Sorting
        Collections.sort(height, ((a,b) -> {
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        }));
        //reverse sort
        final PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        pq.offer(0);
        int prev = 0;
        for(final int[] h:height){
            if(h[1]<0){
                pq.offer(-h[1]);
            } else{
                pq.remove(h[1]);
            }

            final int curr = pq.peek();
            if(prev!=curr){
                ret.add(new int[]{h[0], curr});
                prev = curr;
            }
        }


        return ret;
    }

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

//    public static List<int[]> getSkyline(final int[][] buildings) {
//        final List<int[]> result = new ArrayList<>();
//        final List<int[]> height = new ArrayList<>();
//        for(final int[] b:buildings) {
//            height.add(new int[]{b[0], -b[2]});
//            height.add(new int[]{b[1], b[2]});
//        }
//        Collections.sort(height, (a, b) -> {
//                if(a[0] != b[0])
//                {
//                    return a[0] - b[0];
//                }
//                return a[1] - b[1];
//        });
//        final Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
//        pq.offer(0);
//        int prev = 0;
//        for(final int[] h:height) {
//            if(h[1] < 0) {
//                pq.offer(-h[1]);
//            } else {
//                pq.remove(h[1]);
//            }
//            final int cur = pq.peek();
//            if(prev != cur) {
//                result.add(new int[]{h[0], cur});
//                prev = cur;
//            }
//        }
//        return result;
//    }

}
