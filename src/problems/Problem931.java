package problems;

import java.util.HashMap;
/*
https://leetcode.com/contest/weekly-contest-108/problems/binary-subarrays-with-sum/
 */
public class Problem931 {
    public int numSubarraysWithSum(int[] A, int S) {
        int count = 0, sum = 0;
        HashMap< Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (map.containsKey(sum - S))
                count += map.get(sum - S);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }



    void printArray(int i,int n,int[] A) {
        System.out.println();
        while(i<n) {
            System.out.print(A[i]+" ");
            i++;
        }
        System.out.println();
    }

}
