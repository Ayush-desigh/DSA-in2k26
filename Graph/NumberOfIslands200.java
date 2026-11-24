public class NumberOfIslands200 {
    
    int rows;
    int cols;
    public int numIslands(char[][] grid) {

        rows=grid.length;
        cols=grid[0].length;
        boolean[][] visited=new boolean[rows][cols];
        int count=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j] == '1' && visited[i][j]!=true)
                {
                    dfs(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
        
    }

    public void dfs(int row,int col,char[][] grid,boolean[][] visited)
    {
        if(row<0 || row>=rows || col<0 || col>=cols|| grid[row][col] == '0' || visited[row][col] )
        {
            return;
        }
        visited[row][col]=true;
        int[][] adj={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        
        for(int[] list:adj)
        {
           
            
                dfs(list[0],list[1],grid,visited);
            
        }
    }


    public static void main(String[] args) {

        char[][] grid={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'},};

        NumberOfIslands200 obj=new NumberOfIslands200();
      int ans=  obj.numIslands(grid);
      System.out.println(ans);
        for(char[] n:grid)
        {
            for(char j:n)
            System.out.print(j+" ");

            System.out.println();
        }
        
    }
}
