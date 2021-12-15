package gs;

public class IsAnagram
{

    public static void main(final String[] args)
    {
        final String s1 = "rat";
        final String s2 = "tar";
        if(s1.length()!=s2.length()){
            System.out.println("crap");
        }
        final char[] c = new char[256];
        for(int i=0;i<s1.length();i++){
            c[s1.charAt(i)-'a']++;
            c[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!=0){
                System.out.println("not anagrams");
            }
        }


    }

}
