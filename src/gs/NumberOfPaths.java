package gs;

public class NumberOfPaths
{
    public static int paths(final int r, final int c){
        if(r==3 || c==3){
            return 1;
        }
        return paths(r+1,c)+paths(r,c+1);
    }

    public static void main(final String[] args)
    {
        System.out.println(paths(1,1));

    }

}
