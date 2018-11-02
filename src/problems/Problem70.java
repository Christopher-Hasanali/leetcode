package problems;

/*
https://leetcode.com/problems/climbing-stairs/
 */
public class Problem70 {
    public int climbStairs(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        else if(n==2) return 2;
        else {
            int p1=1,p2=2;
            int ways=0;
            n-=2;
            while(n>0) {
                ways=p1+p2;
                p1=p2;p2=ways;

                //System.out.println(n+" "+ways+ " "+p1+" "+p2);
                n--;
            }
            return ways;
        }
    }
}
