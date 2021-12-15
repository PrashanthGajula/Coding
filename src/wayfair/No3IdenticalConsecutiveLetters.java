package wayfair;

import java.util.Stack;

public class No3IdenticalConsecutiveLetters
{

    public static void main(final String[] args)
    {
        final String s = "eedaaad";// "xxxtxxx", "uuuuxaaaaxuuu"
        System.out.println(deleteExtraChars(s));
    }

    private static String deleteExtraChars(final String s)
    {
        final Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for (final Character c : s.toCharArray())
        {
            if (stack.isEmpty())
            {
                stack.push(c);
                count++;
            }
            else if (stack.peek() == c)
            {
                if (count < 2)
                {
                    stack.push(c);
                    count++;
                }
            }
            else if (stack.peek() != c)
            {
                stack.push(c);
                count = 1;
            }
        }
        final StringBuffer sb = new StringBuffer();
        stack.forEach(e -> sb.append(e));
        return sb.toString();
    }

}
