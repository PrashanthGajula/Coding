package gs;

import java.util.Arrays;
import java.util.Comparator;

public class BigNumberFromArray
{

    public static void main(final String[] args)
    {
        final int[] init = {54,546,548,60};
        final String[] s = new String[init.length];
        for(int i=0;i<init.length;i++){
            s[i] = String.valueOf(init[i]);
        }

        final Comparator<String> comp = new Comparator<String>()
        {
            @Override
            public int compare(final String o1, final String o2)
            {
               return (o2+o1).compareTo(o1+o2);
            }
        };
Arrays.sort(s, comp);
for(int i=0;i<s.length;i++){
    System.out.print(s[i]);
}

    }

}
