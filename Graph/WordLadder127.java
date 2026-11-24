import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class WordLadder127
 {

    public List<String> getNeighour(String word,HashSet<String> set)
    {
        List<String> neighours=new ArrayList<>();
        for(int i=0;i<word.length();i++)
        {
            for(char ch='a';ch<='z';ch++)
            {
                if(ch==word.charAt(i))
                {
                    continue;
                }
                String newWord=word.substring(0,i)+ch+word.substring(i+1,word.length());
                if(set.contains(newWord))
                {
                    neighours.add(newWord);
                }
            }
        }

        return neighours;

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {


        HashSet<String> set=new HashSet<>(wordList);
        if(!set.contains(endWord))
        {
            return 0;
        }

        Queue<String> q=new LinkedList<>();
        q.add(beginWord);

         if(set.contains(beginWord)){
            set.remove(beginWord);
        }
        int level=0;
        while(!q.isEmpty())
        {
            int currSize=q.size();
            for(int i=0;i<currSize;i++)
            {
                String node=q.poll();
                 if(node.equals(endWord)){
                    return level+1;
                }

                List<String> neighour=getNeighour(node,set);
                for(String word:neighour)
                {
                    if(set.contains(word))
                    {
                        q.add(word);
                        set.remove(word);
                    }
                }
            }
            level++;
        }
        return 0;
        
    }


    public static void main(String[] args) {
       String beginWord = "hit", endWord = "cog";
       List<String> wordList = List.of("hot","dot","dog","lot","log","pot","sot","cog");
       WordLadder127 wl=new WordLadder127();
    
      int n= wl.ladderLength(beginWord, endWord, wordList);
      System.out.println("Minimum possibility to reach there is "+n);
    }
}