package problems;

public class Problem933 {
    int [] a;
    int lastL=0;
    int lastR=0;
    public void RecentCounter() {
        a  = new int[10001];
    }

    public int ping(int t) { a[lastR++] = t;
      int l=t-3000,r=t;
      int newpos=lastL;
      if(l<0) return lastR;
      while(a[newpos]<l) newpos++;
      lastL=newpos;
      return lastR-lastL;
    }
}
