package problems;

/*
https://leetcode.com/problems/min-cost-climbing-stairs/
 */
public class Problem746 {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int a[]=new int[n];
        int s=0;
        if(n==1) return 0;
        else if(n==2) return Math.min(cost[0],cost[1]);
        a[0]=cost[0];a[1]=cost[1];
        for(int i=2;i<cost.length;i++) {
            a[i]=Math.min(cost[i]+a[i-1], cost[i]+a[i-2]);
        }
        return Math.min(a[n-1],a[n-2]);
    }
}
