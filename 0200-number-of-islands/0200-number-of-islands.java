import java.util.*;
class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    dfs(grid,i,j);//1만나면 기준노드 시작
                }
            }
        }
        return cnt;
    }
    public void dfs(char[][] grid,int i,int j){//방향
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]=='0'){
            return;
        }//범위 벗어나면 return, 순회 끝
        grid[i][j] = '0';
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        return;
    }
}