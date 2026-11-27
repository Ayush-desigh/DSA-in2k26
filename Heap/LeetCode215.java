import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode215 {
    

      public  static int findKthLargest(int[] nums, int k) {

        Queue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        for(int i:nums)
        {
            q.offer(i);
        }
        for(int i=0;i<k-1;i++)
        {
            q.poll();
        }
        return q.peek();
        
        
    }

    public static void main(String[] args) {
        
        int[] nums=new int[]{3,2,3,1,2,4,5,5,6};
        int k=4;
        int ans=findKthLargest(nums, k);
        System.out.println(ans);
    }
}
