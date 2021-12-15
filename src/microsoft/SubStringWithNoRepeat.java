package microsoft;

/**
 * Given a string s, find the minimum number of substrings you can create without having the same letters repeating in each substring. <br>
 * E.g world -> 5, as the string has no letters that occur more than once.<br>
 * dddd -> 4, as you can only create substring of each character. <br>
 * abba -> 2, as you can make substrings of ab, ba. <br>
 * cycle-> 2, you can create substrings of (cy, cle) or (c, ycle)
 */
public class SubStringWithNoRepeat
{

    public static void main(final String[] args)
    {
        System.out.println(subStringsWithNoRepeat("cycle"));

    }

    private static int subStringsWithNoRepeat(final String s)
    {
        if (s == null || s.isEmpty())
        {
            return 0;
        }
        String temp = "";
        int res = 1;
        for (final char c : s.toCharArray())
        {
            if (temp.contains(c + ""))
            {
                res++;
                temp = c + "";
            }
            else
            {
                temp += c + "";
            }
        }
        return res;
    }

}
