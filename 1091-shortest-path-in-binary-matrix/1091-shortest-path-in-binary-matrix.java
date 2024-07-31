class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        //8방
        int[][] arrow={
            {-1,-1},{-1,0},{-1,1},
            {0,-1},{0,1},
            {1,-1},{1,0},{1,1}
        };
        //최소 거리 = BFS
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0) return -1;
        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{0,0,1});//x,y,length

        while(!que.isEmpty()){
            int[] node=que.poll();
            int x=node[0];int y=node[1];int length=node[2];
            if(x==n-1 && x==n-1){
                return length;
            }
            grid[x][y] = 1;
            for(int[] to:arrow){
                int toX = x+to[0];
                int toY = y+to[1];
                
                if(toX<n && toX>=0 && toY<n && toY>=0 && grid[toX][toY]==0){
                    que.add(new int[]{toX,toY,length+1});
                    grid[toX][toY]=1;
                }
            }
        }
        return -1;
    }
}