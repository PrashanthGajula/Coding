package wayfair;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PQ
{

    public static void main(final String[] args)
    {
        // TODO Auto-generated method stub
        final PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> Integer.compare(a, b));
        pq.add(11);
        pq.add(22);
        pq.add(15);
        pq.add(10);

        System.out.println(pq.peek());
        System.out.println(pq);

        final String s = "Hello !World";

        final List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < adj.size(); i++)
        {
            adj.add(i, new ArrayList<Integer>());
        }

    }

}
