package problems;

public class Problem900 {

    int a[];
    int size;
    int current=0;
    public Problem900(int[] A) {
        int n=A.length;
        size=n;
        a=A;
    }

    public int next(int n) {
        if(current>=size) return -1;
        int val = a[current];
        if(n<val) {
            a[current] = val-n;
            return a[current+1];
        } else if(n==val){
            current = current+2;
            if(current>=size) return -1;
            return a[current-1];
        } else {
            while(n>val) {
                n=n-val;
                current=current+2;
                if(current>=size) return -1;
                val=a[current];
            }
            if(n==val) {
                current = current+2;
                if(current>=size) return -1;
                return a[current-1];
            } else {
                a[current] = val-n;
                return a[current+1];
            }
        }
    }
}

