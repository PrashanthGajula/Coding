package ck;

public class PossibleKnightMoves
{

    public static void main(final String[] args)
    {
        final int mat[][] = {{1, 0, 1, 0}, {0, 1, 1, 1}, {1, 1, 0, 1}, {0, 1, 1, 1}};
        final int p = 2;
        final int q = 2;
        System.out.println("possible moves : " + findPossibleMoves(mat, p, q));

    }

    private static int findPossibleMoves(final int[][] mat, final int p, final int q)
    {
        final int[] x = {2, 1, 2, 1, -2, -1, -1, -2};
        final int[] y = {1, 2, -1, -2, -1, -2, 2, 1};
        int count = 0;

        for (int i = 0; i < 8; i++)
        {
            final int X = p + x[i];
            final int Y = q + y[i];

            if (X >= 0 && Y >= 0 && X < mat[0].length && Y < mat.length && mat[X][Y] == 0)
            {
                System.out.println(X + "," + Y);
                count++;
            }

        }

        return count;
    }

}
