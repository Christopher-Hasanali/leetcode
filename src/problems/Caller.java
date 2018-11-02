package problems;

import java.util.List;

public class Caller {
    public static void main(String [] a) {
        Problem54 p = new Problem54();
        Problem629 p2 = new Problem629();
        int[][] matrix = new int[3][3];

        Problem929 p929 = new Problem929();
        Problem930 p930 = new Problem930();
        Problem931 p931 = new Problem931();
        Problem932 p932 = new Problem932();
        Problem121 p121 = new Problem121();
        Problem70 p70 = new Problem70();
        Problem32 p32 = new Problem32();
        Problem53 p53 = new Problem53();
        Problem198 p198 = new Problem198();
        //System.out.println(p929.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
//[[-80,-13,22],[83,94,-5],[73,-48,61]]
        matrix[0] = new int[]{ -80,-13,22 };
        matrix[1] = new int[]{ 83,94,-5 };
        matrix[2] = new int[]{ 73,-48,61 };

        //System.out.println(p931.numSubarraysWithSum(new int[]{1,0,1,0,1},2));
        //printArray( p932.beautifulArray(5));
        //System.out.println(p32.longestValidParentheses(")()())()()("));
        //System.out.println(p121.maxProfit(new int[]{7,1,5,3,6,4}));
        //System.out.println(p70.climbStairs(5));
        //System.out.println(p53.maxSubArray(new int[]{8,-19,5,-4,20}));
        System.out.println(p198.rob(new int[]{2,1,1,2}));
        //printListInteger(p.spiralOrder(matrix));
        //System.out.println(p2.kInversePairs(3,1));
    }
    public static void printListInteger(List<Integer> a) {
        System.out.println();
        for(int x:a){
            System.out.print(x + " ");
        }
    }

    public static void printArray(int[] a) {
        for(int i=0;i<a.length;i++)
        System.out.print(a[i] + " ");
    }
}
