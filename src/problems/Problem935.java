package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem935 {

    int [][]c=new int [10][5000];
    int sum=0;
    public int knightDialer(int n) {

        if(n==0) return 0;
        if(n==1) return 10;
        //if(n==2) return 20;
        n--;

        int a[] = new int[10];
        a[0] = 2;
        a[1] = 2;
        a[2] = 2;
        a[3] = 2;
        a[4] = 3;
        a[5] = 0;
        a[6] = 3;
        a[7] = 2;
        a[8] = 2;
        a[9] = 2;

        List[] b= new List[10];
        ArrayList<Integer> a1=new ArrayList();
        a1.add(6);a1.add(8);
        b[1]=a1;
        ArrayList<Integer> a2=new ArrayList();
        a2.add(7);a2.add(9);
        ArrayList<Integer> a3=new ArrayList();
        a3.add(4);a3.add(8);
        ArrayList a4=new ArrayList<Integer>();
        a4.add(9);a4.add(3);a4.add(0);
        ArrayList<Integer> a5=new ArrayList();

        ArrayList<Integer> a6=new ArrayList();
        a6.add(1);a6.add(7);a6.add(0);
        ArrayList<Integer> a7=new ArrayList();
        a7.add(6);a7.add(2);
        ArrayList<Integer> a8=new ArrayList();
        a8.add(1);a8.add(3);
        ArrayList<Integer> a9=new ArrayList();
        a9.add(2);a9.add(4);
        ArrayList<Integer> a0=new ArrayList();
        a0.add(4);a0.add(6);
        b[1]=a1;
        b[2]=a2;
        b[3]=a3;
        b[4]=a4;
        b[5]=a5;b[9]=a9;
        b[6]=a6;
        b[7]=a7;
        b[8]=a8;
        b[0]=a0;
         for (int i = 0; i < 10; i++) {
                sum+=(recur(i,n,b,a)%(1000000000+7));
             sum%=(1000000000+7);
            }

        return sum;
    }
    int recur(int i,int n,List[] b,int a[]) {
        int localsum=0;
        ArrayList<Integer> temp = (ArrayList<Integer>)b[i];

        if(n==1) return a[i];
        if(c[i][n]!=0) return c[i][n];
        for(int k:temp) {
            localsum+=(recur(k,n-1,b,a)%(1000000000+7));
            localsum%=(1000000000+7);
        }
        c[i][n]=localsum;
        return localsum;
    }
}
