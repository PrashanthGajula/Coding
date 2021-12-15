package ck;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoListsIteration
{

    public static void main(final String[] args)
    {
        final account a1 = new account(1, 100);
        final account a2 = new account(2, 200);
        final account a3 = new account(3, 300);
        final account a4 = new account(4, 400);
        final account a5 = new account(5, 500);
        final List<account> l1 = Arrays.asList(a1, a2, a3, a4, a5);

        final account a6 = new account(1, -50);
        final account a7 = new account(6, 200);
        final account a8 = new account(3, -15);
        final account a9 = new account(7, 7700);
        final account a10 = new account(5, -25);
        final List<account> l2 = Arrays.asList(a6, a7, a8, a9, a10);

        final HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for (final account a : l1)
        {
            hm.put(a.acno, Arrays.asList(a.amount, 0));
        }
        for (final account a : l2)
        {
            if (!hm.containsKey(a.acno))
            {
                hm.put(a.acno, Arrays.asList(a.amount, 1));
            }
            else
            {
                final List<Integer> li = hm.get(a.acno);
                final int newAmount = li.get(0) + a.amount;
                li.set(0, newAmount);
            }
        }

        for (final Map.Entry<Integer, List<Integer>> entry : hm.entrySet())
        {
            System.out.print("accountNumber: " + entry.getKey());
            final List<Integer> li = entry.getValue();
            if (li.get(1) == 0)
            {
                System.out.println(" - old A/C with balance " + li.get(0));
            }
            else
            {
                System.out.println(" - new A/C with balance " + li.get(0));
            }
        }
    }

    static class account
    {
        int acno;
        int amount;

        account(final int acno, final int amount)
        {
            this.acno = acno;
            this.amount = amount;
        }
    }

}
