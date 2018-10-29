//count numberof islands - dfs
class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        for(int i =0;i<grid.length;i++)
            for(int j=0;j< grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfsfill(grid,i,j);
                    count++;
                }
            }
        return count;
    }
    public void dfsfill(char[][]grid, int  i,int j){
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]=='1'){
            grid[i][j]='0';
            dfsfill(grid,i-1,j);
            dfsfill(grid,i,j-1);
            dfsfill(grid,i,j+1);
            dfsfill(grid,i+1,j);
        }
    }
}

//bfs
class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        for(int i =0;i<grid.length;i++)
            for(int j=0;j< grid[0].length;j++){
                if(grid[i][j]=='1'){
                    bfsfill(grid,i,j);
                    count++;
                }
            }
        return count;
    }
    public void bfsfill(char[][]grid, int  x,int y){
        grid[x][y]='0';
        int m = grid[0].length;
        LinkedList<Integer> q1 = new LinkedList<Integer>();
        //initial offer
        q1.offer(x*m+y);
        while(!q1.isEmpty()){
            int wha = q1.poll();
            int i = wha/m;
            int j = wha%m;
            if(i>0 && grid[i-1][j]=='1')
            {
                grid[i-1][j]='0';
                q1.offer(((i-1)*m)+j);
            }
            if(j>0 && grid[i][j-1]=='1')
            {
                grid[i][j-1]='0';
                q1.offer((i*m)+j-1);
            }
            if(i<grid.length-1 && grid[i+1][j]=='1')
            {
                grid[i+1][j]='0';
                q1.offer(((i+1)*m)+j);
            }
            if(j<m-1 && grid[i][j+1]=='1')
            {
                grid[i][j+1]='0';
                q1.offer((i*m)+j+1);
            }
        }
        
    }
}