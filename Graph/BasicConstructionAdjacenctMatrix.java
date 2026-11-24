

import java.util.ArrayList;

public class BasicConstructionAdjacenctMatrix {

  public static class Graph
    {
        int adjMatrix[][];
        Graph(int nodes)
        {
            adjMatrix=new int[nodes][nodes];
        }
    

    public  void  addEdgesInMatrix(int[][] edgs,boolean isDirected)
    { for(int[] edge:edgs)
            {
              
                int u=edge[0];
                int v=edge[1];

                  // for direted
                  if(isDirected)
                  {
                    adjMatrix[u][v]=1;

                  }
                  else
                  {
                    //For un directeds
                     adjMatrix[u][v]=1;
                      adjMatrix[v][u]=1;
                  }
            }
    }

    public  void  addWeightedEdgesInMatrix(int[][] edgs,boolean isDirected)
    { for(int[] edge:edgs)
            {
              
                int u=edge[0];
                int v=edge[1];
                int w=edge[2];

                  // for direted
                  if(isDirected)
                  {
                    adjMatrix[u][v]=w;

                  }
                  else
                  {
                    //For un directeds
                     adjMatrix[u][v]=w;
                      adjMatrix[v][u]=w;
                  }
            }
    }

    public void getDegreeInUnDirectedGraph(int[][] edges,int nodes)
    {
        int degree[]=new int[nodes];
        for(int[] edge:edges)
        {
            int u=edge[0];
            int v=edge[1];
            degree[u]++;
            degree[v]++;

        }

            for(int i=0;i<nodes;i++)
            {

                System.out.println(i+" degree is-> "+degree[i]);
            }
    }

     public void getDegreeInDirectedGraph(int[][] edges,int nodes)
    {
        int indegree[]=new int[nodes];
        int outdegree[]=new int[nodes];
        for(int[] edge:edges)
        {
            int from=edge[0];
            int to=edge[1];
            indegree[to]++;
            outdegree[from]++;

        }

        for(int i=0;i<nodes;i++)
        {

            System.out.print(i+" indegree is-> "+indegree[i]+" - ");
             System.out.print(i+" outdegree is-> "+outdegree[i]);
             System.out.println();
        }
    }

    public void printMatrix()
    {
        for(int i=0;i<adjMatrix.length;i++)
        {
            System.out.print("Row"+i+"->");
            for(int j=0;j<adjMatrix[i].length;j++)
            {
                System.out.print(adjMatrix[i][j]+" , ");
            }
            System.out.println();
        }
    }
    }

    public static ArrayList<Integer>  dfsWithAdjMatrix(int nodes,int[][] adj)
    {
          boolean[] visited=new boolean[nodes];
          ArrayList<Integer> res=new ArrayList<>();

          for(int i=0;i<visited.length;i++)
          {
            if(visited[i]!=true)
            {
                dfs(visited, i, adj, res);
            }
          }
          return res;
    }
    public static void dfs( boolean visited[],int node,int [][] adj,ArrayList<Integer> res )
    {
            visited[node]=true;
    
            res.add(node);
    for (int neighbour = 0; neighbour < adj.length; neighbour++) {
        if (adj[node][neighbour] == 1 && !visited[neighbour]) {
            dfs(visited, neighbour, adj, res);  // neighbour pass karo
        }
    }
            
    }

    public static void main(String[] args) {
        
        int edgs[][]={{0,1,1},{1,0,1},{1,1,0}};
        int nodes=3;
        Graph graph=new Graph(nodes);
        boolean visited[]=new boolean[nodes];
    //    ArrayList<Integer> ans=dfsWithAdjMatrix(nodes, edgs);
    //    System.out.println(ans.toString());
      //  graph.addEdgesInMatrix(edgs, false);
         graph.getDegreeInUnDirectedGraph(edgs, nodes);
        // graph.printMatrix();
    //    graph.getDegreeInDirectedGraph(edgs, nodes);
    }
    

    
}
