package problems;

public class Problem303 {
    int a[];
    public void NumArray(int[] nums) {
        a=nums;
        int n=nums.length,sum=0;
        for(int i=1;i<n;i++) {
            a[i]+=a[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if(i==0) return a[j];
        else return a[j]-a[i-1];
    }
}
