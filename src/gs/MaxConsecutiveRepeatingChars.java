package gs;

public class MaxConsecutiveRepeatingChars
{

    public static void main(final String[] args)
    {
        final String s = "geeekkeeeee";
          int maxCount=0; Character maxChar = ' ';
        int currCount=0;  Character curChar=' ';

        for(int i=0;i<s.length();i++){
//            if(maxCount<currCount){
//                maxCount = currCount;
//                maxChar = curChar;
//            }
            if(curChar.equals(s.charAt(i))){
                currCount++;
            }else{
                curChar=s.charAt(i);
                currCount=1;
            }

            //if(i==s.length()-1){
                if(maxCount<currCount){
                    maxCount = currCount;
                    maxChar = s.charAt(i);
                }
            //}

        }
        System.out.println(maxChar + " "+ maxCount);



    }

}
