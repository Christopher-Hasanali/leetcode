package problems;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 */
public class Problem914 {
    int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public  boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map= new HashMap();


        int n=deck.length;
        int min=10003;
        for(int j=0;j<n;j++) {

            if(map.get(deck[j]) == null) {
                map.put(deck[j], 1);
            } else {
                map.put(deck[j], map.get(deck[j]) + 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {

            if(entry.getValue() != 0 && entry.getKey() < min) {
                // System.out.println("\nupdating min="+min);
                min=(int)entry.getValue();
            }
            //System.out.println("\nj="+j);
        }


        //System.out.println("min="+min);
        if(min<2) return false;
        int result=min;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            result= gcd(result, entry.getValue());
            if(result==1) return false;
        }
        return true;
    }

    public  boolean hasGroupsSizeX_faster(int[] deck) {
        int a[] = new int[10002];
        for(int i=0;i<=10001;i++) {
            a[i]=0;
        }
        int n=deck.length;
        int min=10003;
        for(int j=0;j<n;j++) {
            int x=a[deck[j]] + 1;
            a[deck[j]] = x;
        }
        //print(a);
        for(int j=0;j<10002;j++) {

            if(a[j]!=0 && a[j]<min) {
                // System.out.println("\nupdating min="+min);
                min=a[j];
            }
            //System.out.println("\nj="+j);
        }
        //System.out.println("min="+min);
        if(min<2) return false;
        int result=min;
        for(int i=0;i<10002;i++) {
            result= gcd(result, a[i]);
            if(result==1) return false;
        }
        return true;
    }
}
