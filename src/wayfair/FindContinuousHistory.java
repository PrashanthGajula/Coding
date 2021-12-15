package wayfair;

import java.util.ArrayList;
import java.util.List;

/**
 * Question:
 * <p>
 * We have some clickstream data that we gathered on our client's website. Using cookies, we collected snippets of users' anonymized URL histories
 * while they browsed the site. The histories are in chronological order, and no URL was visited more than once per person. Write a function that
 * takes two users' browsing histories as input and returns the longest contiguous sequence of URLs that appears in both. <br>
 * <br>
 * Sample input:<br>
 * user0 = ["/start", "/green", "/blue", "/pink", "/register", "/orange","/one/two"]<br>
 * user1 = ["/start", "/pink", "/register", "/orange", "/red", "a"]<br>
 * <p>
 * Sample output: <br>
 * findContiguousHistory(user0, user1) => ["/pink", "/register", "/orange"] <br>
 * URL:
 * https://leetcode.com/discuss/interview-question/1257950/Wayfair-or-Karat-Interview-or-L4-Senior-Software-Engineer-or-Question-1-Find-Contiguous-URL-History
 */
public class FindContinuousHistory
{

    public static void main(final String[] args)
    {
        final String[] user1 = {"/start", "/green", "/blue", "/pink", "/register", "/orange", "/one/two"};
        final String[] user2 = {"/start", "/pink", "/register", "/orange", "/red", "a"};
        final List<String> fch = findContinuousHistory(user1, user2);
        System.out.println(fch);
    }

    public static List<String> findContinuousHistory(final String[] user1, final String[] user2)
    {
        final List<String> result = new ArrayList<String>();
        final int[][] dp = new int[user1.length + 1][user2.length + 1];
        int max = 0;
        int index = 0;

        for (int i = user1.length - 1; i >= 0; i--)
        {
            for (int j = user2.length - 1; j >= 0; j--)
            {
                if (user1[i].equals(user2[j]))
                {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                    if (max < dp[i][j])
                    {
                        max = dp[i][j];
                        index = j;
                    }
                    break;
                }
            }
        }

        for (int i = index; i < index + max; i++)
        {
            result.add(user2[i]);
        }
        return result;
    }
}

// Time : O(m*n) m,n are lengths of A and B.
// Space: O(m*n) space used by dp.
