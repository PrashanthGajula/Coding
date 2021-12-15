package wf.practice;

import java.util.Stack;

public class No3IdenticalConsecutiveLetters
{

    public static void main(final String[] args)
    {
        final String s = "uuuuxaaaaxuuu";// "xxxtxxx";// "eedaaad", "uuuuxaaaaxuuu"
        System.out.println(deleteExtraChars(s));
    }

    private static String deleteExtraChars(final String s)
    {
        final Stack<Character> stack = new Stack<>();
        int count = 0;
        final StringBuffer sb = new StringBuffer();

        for (final char c : s.toCharArray())
        {
            if (stack.isEmpty())
            {
                stack.push(c);
                sb.append(c);
                count++;
            }
            else
            {
                if (stack.peek() != c)
                {
                    while (!stack.isEmpty())
                    {
                        stack.pop();
                    }
                    count = 0;
                    stack.push(c);
                    count++;
                    sb.append(c);
                }
                else
                {
                    if (count < 2)
                    {
                        stack.push(c);
                        count++;
                        sb.append(c);
                    }
                    else
                    {
                        stack.push(c);
                        count++;
                    }
                }
            }
        }

        return sb.toString();
    }

}
