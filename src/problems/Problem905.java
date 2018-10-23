package problems;

/*
https://leetcode.com/problems/sort-array-by-parity/
 */
public class Problem905 {
    public  int[] sortArrayByParity(int[] A) {

        int n=A.length-1;
        int i=0,j=n;
        while(i<j) {
            while(i<=n && isEven(A[i])) {
                i++;
            }
            while(j>=0 && !isEven(A[j])) j--;
            if(i<j) {
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        return A;
    }

    boolean isEven(int x) {
        if(x==0) {
            return true;
        }
        return (x%2==0);
    }
}