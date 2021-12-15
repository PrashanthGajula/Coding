package ck;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists
{

    public static void main(final String[] args)
    {
        final List<Integer> li = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++)
        {
            li.add(i);
        }
        System.out.println(li.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));
        System.out.println(li);
    }
}
