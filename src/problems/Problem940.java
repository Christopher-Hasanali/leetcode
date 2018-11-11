package problems;

import java.util.HashMap;
import java.util.HashSet;

public class Problem940 {
    HashSet<String> map = new HashSet<>();
    public int distinctSubseqII(String S) {
        getSubs(S);
        System.out.println(map.size());
        return map.size();
    }

    void getSubs(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                String a = s.substring(i, j);
                if (!map.contains(a)) {map.add(a);
                for (int k = 1; k < a.length() - 1; k++) {
                    StringBuffer sb = new StringBuffer(a);
                    sb.deleteCharAt(k);
                    getSubs(sb.toString());
                }}
            }
        }
    }
/*
    void subString(String a, int n)
    {

        HashMap t=new HashMap();
        char []str=a.toCharArray();
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                String temp="";
                for (int k = i; k <= j; k++) temp+=str[k];
                if(t.get(temp) == null) t.put(temp,1);
            }
        }
        System.out.println(t.size());
    }

*/
}
