public class LeetCodeProblem1791 {

    /*
    Find centre of star graph 

    There is an undirected star graph consisting of n nodes labeled from 1 to n.
     A star graph is a graph where there is one center node and exactly n - 1 edges
      that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates
 that there is an edge between the nodes ui and vi. Return the center of the given
  star graph.

Input: edges = [[1,2],[2,3],[4,2]]
Output: 2
Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
     */
    public static void main(String[] args) {
        
        int[][] edge={{1,2},{5,1},{1,3},{1,4}};
        // Graph graph=new Graph(4);
        // graph.addEdgesInMatrix(edge, false);
      int ans=  findCentre(edge);
      System.out.println("Centre is "+ans);
        }

    public static int findCentre(int[][] edges)
    {

         int n=edges.length+1;
        int[] deg=new int[n+1];
        for(int[] edge:edges )
        {
            int u=edge[0];
            int v=edge[1];
            deg[u]++;
            deg[v]++;
        }

        for(int i=1;i<=n;i++)
        {
            if(deg[i]==n-1)
            {
                return i;
            }
        }
        return -1;
        
    }
    
}
