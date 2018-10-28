package problems;

public class Problem930 {
    public int minFallingPathSum(int[][] A) {
        int r = A.length;
        if (r < 1) return 0;
        int c = A[0].length;
        int [][] a = new int[r][c];
        for(int i=0;i<c;i++) {
            a[0][i]=A[0][i];
        }
        for(int i=1;i<r;i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=100*102;
            }
        }

        for(int i=1;i<r;i++) {
            for(int j=0;j<c;j++) {
               a[i][j] = Math.min(a[i][j],a[i-1][j]+A[i][j]);
               // System.out.println("aaa:" + A[i-1][j] + " bbb:"+A[i][j]);
                //System.out.println("Updating i j: "+Math.min(a[i][j],A[i-1][j]+A[i][j]));
               if(j-1 >= 0) {
                   a[i][j-1] = Math.min(a[i][j-1],a[i-1][j]+A[i][j-1]);
                  // System.out.println("Updating i j-1: "+Math.min(a[i][j-1],A[i-1][j]+A[i][j-1]));
               }
                if(j+1 < c) {
                    a[i][j+1] = Math.min(a[i][j+1],a[i-1][j]+A[i][j+1]);
                   // System.out.println("Updating i j+1: "+Math.min(a[i][j+1],A[i-1][j]+A[i][j+1]));
                }

            }

        }
        for(int i=0;i<r;i++) {
            System.out.println();
            printArray(a[i]);
        }
        System.out.println();
        int min=101;
        for(int i=0;i<c;i++) {
            if(min>a[r-1][i]) min=a[r-1][i];
        }
        return min;
    }
    public static void printArray(int[] a) {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
}
