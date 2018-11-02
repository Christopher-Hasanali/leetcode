package problems;

import java.util.ArrayList;
import java.util.Stack;

/*
https://leetcode.com/problems/longest-valid-parentheses/
 */
public class Problem32 {
    public int longestValidParentheses(String str) {
        Stack s = new Stack();
        int max=0,n=str.length();
        s.push(-1);
        for(int i=0;i<n;i++) {
            if(str.charAt(i)=='(') s.push(i);
            else {
                s.pop();
                if(s.empty()) s.push(i);
                else max = Math.max(max, i-(int)s.peek());
            }


        }
        return max;
    }
}
