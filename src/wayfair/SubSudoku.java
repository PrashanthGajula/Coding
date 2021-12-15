package wayfair;

import java.util.HashSet;
import java.util.Set;

public class SubSudoku
{

    public static void main(final String[] args)
    {
        final int n = 3;
        final int[][] f = {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        System.out.println("Result f : " + checkBlock(f, n));

    }

    public static boolean checkBlock(final int[][] f, final int n)
    {
        final Set<Integer> expectedSet = new HashSet<>();
        for (int i = 1; i <= n; i++)
        {
            expectedSet.add(i);
        }

        // Check all rows
        for (int i = 0; i < f[0].length; i++)
        {
            final Set<Integer> rowSet = new HashSet<Integer>();
            for (int j = 0; j < f[0].length; j++)
            {
                rowSet.add(f[i][j]);
            }

            if (!rowSet.containsAll(expectedSet))
            {
                return false;
            }
        }

        // Check all columns
        for (int i = 0; i < f[0].length; i++)
        {
            final Set<Integer> columnSet = new HashSet<Integer>();
            for (int j = 0; j < f[0].length; j++)
            {
                columnSet.add(f[j][i]);
            }

            if (!columnSet.containsAll(expectedSet))
            {
                return false;
            }
        }
        return true;
    }

}
