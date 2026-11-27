import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode451 {
    

     public static String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        Queue<Character> q=new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        for(char i:map.keySet())
        {
            q.offer(i);
        }
        StringBuffer sb=new StringBuffer();
        while(!q.isEmpty())
        
        {
            char c=q.poll();
            int freq=map.get(c);
            for(int i=0;i<freq;i++)
            {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Adadbdbcdcc";
        String result=frequencySort(s);
        System.out.println(result);

    }
}
