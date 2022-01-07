package ck;

public class ChessValidMoves
{
    static class Coordinates
    {
        int x;
        int y;

        Coordinates(final int x, final int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(final String[] args)
    {
        final Coordinates start = new Coordinates(0, 0);
        final Coordinates end = new Coordinates(1, 1);

        // System.out.println("Checking Knight(horse): " + validMoveForBishop(start, end));
        // System.out.println("Checking Rook(Elephant) " + validMoveForRook(start, end));
        // System.out.println("Bishop (camel) " + validMoveForBishop(start, end));
        // System.out.println("Pawn " + validMoveForPawn(start, end));
        // System.out.println("Queen " + validMoveForQueen(start, end));
        System.out.println("King " + validMoveForKing(start, end));
    }

    private static boolean validMoveForKing(final Coordinates start, final Coordinates end)
    {
        final int[] x = {0, 0, 1, -1, 1, -1, 1, -1};
        final int[] y = {1, -1, 1, 1, 0, 0, -1, -1};

        for (int i = 0; i < x.length; i++)
        {
            final int X = start.x + x[i];
            final int Y = start.y + y[i];

            if (X == end.x && Y == end.y)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean validMoveForQueen(final Coordinates start, final Coordinates end)
    {
        if (validMoveForRook(start, end) || validMoveForBishop(start, end))
        {
            return true;
        }
        return false;
    }

    private static Boolean validMoveForPawn(final Coordinates start, final Coordinates end)
    {
        final int[] x = {0, 1, -1};
        final int[] y = {1, 1, 1};

        for (int i = 0; i < x.length; i++)
        {
            final int X = start.x + x[i];
            final int Y = start.y + y[i];

            if (X == end.x && Y == end.y)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean validMoveForKnight(final Coordinates start, final Coordinates end)
    {
        final int[] x = {2, 1, -1, -2, -2, -1, 1, 2};
        final int[] y = {1, 2, 2, 1, -1, -2, -2, -1};

        for (int i = 0; i < 8; i++)
        {
            final int X = start.x + x[i];
            final int Y = start.y + y[i];

            if (X == end.x && Y == end.y)
            {
                return true;
            }
        }

        return false;
    }

    public static boolean validMoveForRook(final Coordinates start, final Coordinates end)
    {
        if (start.x == end.x || start.y == end.y)
        {
            return true;
        }
        return false;
    }

    public static boolean validMoveForBishop(final Coordinates start, final Coordinates end)
    {
        if (start.x - end.x == start.y - end.y)
        {
            return true;
        }
        else if (start.x - end.x == start.y + end.y)
        {
            return true;
        }
        return false;
    }

}
