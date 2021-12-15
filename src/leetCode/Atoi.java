package leetCode;

public class Atoi
{

    public static void main(final String[] args)
    {
        final String s = "42";
        int n = 0;
        for(int i=0;i<s.length();i++){
            n = n*10 +  Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(n);
    }
}
