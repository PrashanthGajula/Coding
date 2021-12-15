package wf.practice;

public class MaxNoOfAThatCanBeInserted
{

    public static void main(final String[] args)
    {
        final String s = "DOG";
        int aCount = 0;
        int nonACount = 0;

        for (char c : s.toCharArray())
        {
            c = Character.toLowerCase(c);
            if (c == 'a')
            {
                aCount++;
            }
            else
            {
                nonACount++;
            }
        }

        final int x = (nonACount * 2) + 2 - aCount;
        System.out.println(x);

    }

}
