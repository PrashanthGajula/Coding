package gs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder
{

    public static void main(final String[] args)
    {
        final List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(getLadderLength("hit","cog", wordList));

    }

    private static int getLadderLength(final String start, final String end, final List<String> wordList)
    {
        if(!wordList.contains(end))
        {
            return 0;
        }

         int count = 1;
        final Queue<String> q = new LinkedList<>();
        q.add(start);
        final List<String> visited = new LinkedList<>();
        visited.add(start);
        while(!q.isEmpty()){
            final String s = q.peek();
            q.remove();
            if(s!=null){
                for(int i=0;i<s.length();i++){
                    final char[] chars = s.toCharArray();
                    for(char c = 'a';c<='z';c++){
                        chars[i]=c;
                        final String word = new String(chars);//chars.toString();
                        if(word.equals(end)){return count+1;}
                        if(wordList.contains(word) && !visited.contains(word)){
                            q.add(word);
                            visited.add(word);
                        }
                    }
                }
            }else{
                count++;
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
        return 0;
    }

}
