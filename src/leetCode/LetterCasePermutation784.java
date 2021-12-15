package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation784
{
    public static List<String> letterCasePermutation(final String S){
        final List<String> ans = new ArrayList<>();
        compute(ans, S.toCharArray(), 0);
        return ans;
    }
    public static void compute(final List<String> ans, final char[] chars, final int index){
        if(index == chars.length){
            ans.add(new String(chars));
        } else {
            if(Character.isLetter(chars[index])){
                chars[index] = Character.toLowerCase(chars[index]);
                compute(ans, chars, index+1);
                chars[index] = Character.toUpperCase(chars[index]);
            }
            compute(ans, chars, index+1);
        }

    }
    public static void main(final String[] args)
    {
        List<String> mainList = new ArrayList<>();
        mainList = letterCasePermutation("a1b2");
        for(final String s : mainList){
            System.out.println(s);
        }



    }

}
