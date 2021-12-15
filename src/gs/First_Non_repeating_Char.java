package gs;

public class First_Non_repeating_Char
{

    public static void main(final String[] args)
    {
        final String s = "GeeksforGeeks";
        final char[] c = new char[256];

        for(int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(c[s.charAt(i)]==1){
                System.out.println(i + " "+ s.charAt(i));break;
            }
        }


    }

}
