import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BasicConstruction {
    

    static class  Edge{
		int src;
		int des;
		int wt;
		
		public Edge(int s,int d,int w)
		{
			this.src=s;
			this.des=d;
			this.wt=w;
		}
	
	}
	 //==================  Adjacency List  Un Directed Graph Creation ================================
	 public static void createdGraph(ArrayList<Edge>[] graph)
	 {
		 
			// now it is null we have to make it empty
		 for(int i=0;i<graph.length;i++) {
				graph[i]=new ArrayList<>();
			}
		 
		 
			
			
			
			graph[0].add(new Edge(0, 1, 1));
			graph[0].add(new Edge(0, 2, 1));
			
			graph[1].add(new Edge(1, 0, 1));
			graph[1].add(new Edge(1, 3, 1));
			
			graph[2].add(new Edge(2, 0, 1));
			graph[2].add(new Edge(2, 4, 1));
			
			graph[3].add(new Edge(3, 1, 1));
			graph[3].add(new Edge(3, 4, 1));
			graph[3].add(new Edge(3, 5, 1));
			
			graph[4].add(new Edge(4, 2, 1));
			graph[4].add(new Edge(4, 3, 1));
			graph[4].add(new Edge(4, 5, 1));
			
			graph[5].add(new Edge(5, 3, 1));
			graph[5].add(new Edge(5, 4, 1));
			graph[5].add(new Edge(5, 6, 1));
			
			graph[6].add(new Edge(6, 5, 1));
			
			
	 }

	 public static void getDegreeUndirectedGraph(ArrayList<Edge>[] graph,int node)
	 {
		for (int i = 0; i < graph.length; i++) {
        System.out.println(i + " degree is -> " + graph[i].size());
    }

	 }
	 
	 
	 public static void printGraph(ArrayList<Edge>[] graph)
	 {
		 for(int i=0;i<graph.length;i++)
			 
		 {
			 System.out.print(i+" -> ");
			 for(int j=0;j<graph[i].size();j++)
			 {
				 System.out.print(graph[i].get(j).des+" ");
				 
			 }
			 System.out.println();
		 }
	 }


	 public static void bfs1(ArrayList<Edge>[] graph)
	 {
		boolean[] visited=new boolean[graph.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(0);
		while(!q.isEmpty())
		{
			int curr=q.remove();
			if(visited[curr]!=true)
			{
				System.out.print(curr+" ");
				visited[curr]=true;
				for(int i=0;i<graph[curr].size();i++)
				{
					Edge e=graph[curr].get(i);
					q.add(e.des);
				}
			}
		}
	 }

	 public static  void dfs1(ArrayList<Edge>[] graph,int curr,boolean[] visited)
	 {

		System.out.print(curr+" ");
		visited[curr]=true;
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e=graph[curr].get(i);
			if(!visited[e.des])
			{
				dfs(graph,e.des,visited);
			}
		}
	 }
	public static void main(String[] args) {
		
		int v=7;
		ArrayList<Edge>[] list=new ArrayList[v];
		createdGraph(list);
		getDegreeUndirectedGraph(list, v);
	//	printGraph(list);
	bfs1(list);
	System.out.println();
	dfs1(list, 0, new boolean[v]);
		//dfs(list, 0, new boolean[7]);
		//
		//System.out.println(hasPath(list, 0, 6, new boolean[v]));
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void bfs(ArrayList<Edge>[] graph)
	{
		
		
		Queue<Integer> q=new LinkedList<>();
		boolean visited[]= new boolean[graph.length];
		q.add(0);
		
		while(!q.isEmpty())
		{
		//	int levelSize=q.size();
		//	ArrayList<Integer> currList=new ArrayList<Integer>();
			int currentEdge=q.remove();
			if(!visited[currentEdge])
			{
				//currList.add(currentEdge);
				System.out.print(currentEdge+" ");
				visited[currentEdge]=true;
				for(int i=0;i<graph[currentEdge].size();i++)
				{
					Edge e=graph[currentEdge].get(i);
					q.add(e.des);
				}
				
			}
		}
	}
	
	public static void dfs(ArrayList<Edge>[] grap,int curr,boolean visted[])
	{
		System.out.print(curr+" ");
		visted[curr]=true;
		
		for(int i=0;i<grap[curr].size();i++)
		{
			
			Edge e=grap[curr].get(i);
			if(!visted[e.des])
			{
				dfs(grap, e.des, visted);
			}
		}
	}
	
	public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest, boolean visited[])
	{
		if(src==dest)
		{
			return true;
		}
		visited[src]=true;
		for(int i=0;i<graph[src].size();i++)
		{
			Edge e=graph[src].get(i);
			if(!visited[e.des] && hasPath(graph, e.des, dest, visited))
			{
				return true;
			}
		}
		return false;
	}
	
}
