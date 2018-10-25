package problems;
/*
https://leetcode.com/problems/surface-area-of-3d-shapes/
 */
public class Problem892 {
    public int surfaceArea(int[][] grid) {

        int r=grid.length;
        if(r==0) return 0;
        int c=grid[0].length;
        int sum=0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                sum+=6*grid[i][j];
                if(grid[i][j]>1) sum-=(grid[i][j]-1)*2;
                if(i>0) {
                    sum-=Math.min(grid[i][j], grid[i-1][j])*2;
                }
                if(j>0) {
                    sum-=Math.min(grid[i][j], grid[i][j-1])*2;
                }
            }
        }
        return sum;

    }
}
