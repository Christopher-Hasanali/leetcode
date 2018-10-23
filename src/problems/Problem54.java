package problems;

import java.util.LinkedList;
import java.util.List;


/*
https://leetcode.com/problems/spiral-matrix/
 */
public class Problem54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        int c=matrix[0].length;
        int r=matrix.length;

        List<Integer> a = new LinkedList<>();
        int way = 1;
        int lr=0,lc=0;
        int i=0,j=0;
        boolean flag=true;
        while(flag) {
            switch(way) {

                case 1: //leftright
                    if(j>=c) {way=5;break;}
                    while(j<c)
                        a.add(matrix[i][j++]);
                    i++;
                    j--;
                    lr++;
                    if(r<lr || c<lc) way=5;
                    else way=2;
                    break;
                case 2: //topdown
                    if(i>=r) {way=5;break;}
                    while(i<r)
                        a.add(matrix[i++][j]);

                    j--;
                    i--;
                    if(r<lr || c<lc) way=5;
                    else way=3;
                    break;
                case 3: //rightleft

                    if(j<lc) {way=5;break;}
                    while(j>=lc)
                        a.add(matrix[i][j--]);
                    r--;
                    c--;
                    i--;

                    if(r<lr || c<lc) way=5;
                    else way=4;
                    j++;
                    break;
                case 4: //downup
                    if(i<lr) {way=5;break;}
                    while(i>=lr)
                        a.add(matrix[i--][j]);
                    lc++;
                    j++;
                    i++;
                    if(r<lr || c<lc) way=5;
                    else way=1;
                    break;
                default:
                    flag=false;

            }
        }

        return a;
    }

    public void printListInteger(List<Integer> a) {
        for(int x:a){
            System.out.print(x + " ");
        }
    }
}
