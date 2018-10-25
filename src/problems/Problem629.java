package problems;

/*
https://leetcode.com/problems/k-inverse-pairs-array/
 */
public class Problem629 {
    // Limit on N and K
    int M = 1004;

    // 2D array memo for stopping solving same problem
    // again
    int memo[][] = new int[M][M];
    public int kInversePairs(int N, int K)
    {
        System.out.println("N:"+N+" K:"+K);
        // base cases
        if (N == 0)
            return 0;
        if (K == 0)
            return 1;

        // if already solved then return result directly
        if (memo[N][K] != 0)
            return memo[N][K];

        // calling recursively all subproblem of
        // permutation size N - 1
        int sum = 0;
        for (int i = 0; i <= K; i++) {

            // Call recursively only if total inversion
            // to be made are less than size
            if (i <= N - 1)
                sum += kInversePairs(N - 1,
                        K - i);
            System.out.println("Sum is now for N:"+N+" and K:"+K+" sum:"+sum);
        }

        // store result into memo
        memo[N][K] = sum;
        System.out.println("Saving:"+sum);
        return sum;
    }
}
