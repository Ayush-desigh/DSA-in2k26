import java.util.*;
class Solution {
    int  rows;
    int cols;



    /*
    USING  BFS
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows = image.length;
        cols = image[0].length;
        int curColor = image[sr][sc];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        image[sr][sc] = color; //fill / visit
        while(!queue.isEmpty()){
            int node[] = queue.poll();
            int row = node[0];
            int col = node[1];
            int adjList[][] = {{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
            for(int neighbour[] : adjList){
                int r = neighbour[0];
                int c = neighbour[1];
                if(r<0 || r >= rows || c<0 || c>=cols || image[r][c]!=curColor || image[r][c]==color){
                    continue;
                }
                queue.offer(new int[]{r,c});
                image[r][c] = color;
            }
        }
        return image;
    }


    public  int[][] floodFillWithDfs(int[][] image, int sr, int sc, int color)
    {

        rows=image.length;
        cols=image[0].length;
        int currCol=image[sr][sc];
        if(currCol==color)
        {
            return image;
        }
        dfs(sr,sc,currCol,color,image);
        return  image;


    }
    public  void dfs(int row,int col,int curColor,int newCol,int[][] image)
    {
        if(row<0 || row>=rows  || col<0 || col>=cols || image[row][col]!=curColor)
        {
            return;
        }
        image[row][col]=newCol;
        int adjList[][]={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};

        for(int[] n:adjList)
        {
            dfs(n[0], n[1], curColor, newCol, image);
        }
    }

    public static void main(String[] args) {
        
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int sc=1;
        int color=3;
        Solution s=new Solution();
      int ans[][]=  s.floodFillWithDfs(image, sr, sc, color);
      for(int[] res:ans)
      {
        for(int r:res)
        System.out.print(r+" ");
System.out.println();
      }


    }
}