package leetCode;

public class IsAnagram
{

    public static void main(final String[] args)
    {
        final String s1 = "rat";
        final String s2 = "art";
        System.out.println(checkIsAnagram(s1,s2));
    }

    private static boolean checkIsAnagram(final String s1, final String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        final char[] c = new char[256];
        for(int i=0;i<s1.length();i++){
            c[s1.charAt(i)-'a']++;
            c[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]>0)
            {
                return false;
            }
        }
        return true;
    }

}
