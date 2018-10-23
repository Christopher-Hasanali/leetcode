package problems;

import java.util.List;

public class Caller {
    public static void main(String [] a) {
        Problem54 p = new Problem54();
        int[][] matrix = new int[2][3];


        matrix[0] = new int[]{ 2,5,8 };
        matrix[1] = new int[]{ 4,0,-1 };

        printListInteger(p.spiralOrder(matrix));
    }
    public static void printListInteger(List<Integer> a) {
        System.out.println();
        for(int x:a){
            System.out.print(x + " ");
        }
    }

    public static void printArray(int[] a) {
        System.out.printf(a.toString());
    }
}
