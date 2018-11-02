package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem932 {
    public int[] beautifulArray(int N) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        while (res.size() < N) {
            System.out.print("\nResult:");
            printListInteger(res);
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i : res) {
                if (i * 2 - 1 <= N) {
                    tmp.add(i * 2 - 1);
                }
            }
            System.out.print("\nTemp with odds:");
            printListInteger(tmp);
            for (int i : res) {
                if (i * 2 <= N) {
                    tmp.add(i * 2);
                }
            }
            System.out.print("\nTemp with evens:");
            printListInteger(tmp);
            res = tmp;
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void printListInteger(List<Integer> a) {
        System.out.println();
        for(int x:a){
            System.out.print(x + " ");
        }
    }
}
