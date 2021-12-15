package gs;

public class LengthEncodedString
{

    public static void main(final String[] args)
    {
        final String s = "aaabbcddddde";
        final StringBuilder sb = new StringBuilder();
          char c=s.charAt(0) ;
         int count = 0;
        for(int i=0;i<s.length();i++){
            if(c != s.charAt(i)){
                sb.append(c);
                sb.append(count);
                c=s.charAt(i);
                count=1;
            } else {
                count++;
            }
            if(i==s.length()-1){
                sb.append(c);
                sb.append(count);
            }



        }
        System.out.println(sb.toString());

    }

}
