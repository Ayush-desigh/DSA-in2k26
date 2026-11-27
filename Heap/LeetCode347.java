import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode347 {
    

      public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Queue<Integer> q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int i:map.keySet())
        {
            q.offer(i);
        }
         int[] ans=new int[k];
         for(int i=0;i<k;i++)
         {
            ans[i]=q.poll();
         }
         return ans;
        
    }

    public static void main(String[] args) {
         int nums[]=new int[]{1,2,1,2,1,2,3,1,3,2};
         int k=2;
         int[] ans=topKFrequent(nums, k);
         for(int i:ans)
         {
            System.out.println(i);
         }
    }
}
