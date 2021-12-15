package leetCode;

public class Implement_strStr28
{
    public static int strStr(final String haystack, final String needle){
        if((needle.length()==0 || haystack.length()==0) && (needle.equals("")))
        {
            return 0;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int t = i;
                for(int j=0;j<needle.length();j++){
                    if(t<haystack.length()){
                        if(haystack.charAt(t)==needle.charAt(j)){
                        t++;
                    }
                    }

                }
                if(t-i == needle.length()){
                    return i;
                }
            }
        }
        return 0;
    }
    public static void main(final String[] args)
    {
        System.out.println("hello, ll : " + strStr("hello","ll"));

    }
}
