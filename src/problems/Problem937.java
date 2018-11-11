package problems;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Problem937 {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        String a[]=new String[logs.length];
        for(int i=0;i<logs.length;i++) {
            String s[]=logs[i].split(" ");
            //System.out.println("Hello: "+s[1].charAt(0));
            if((s[1].charAt(0) >= 'a' && s[1].charAt(0)<= 'z') || (s[1].charAt(0) >= 'A' && s[1].charAt(0) <= 'Z')) {
                //System.out.println("True");
                String b=s[0];
                int j=1;
                String c="";
                while(j<s.length) {
                    c+=s[j]+ " ";
                    j++;
                }
                c+=","+b;
                a1.add(c);
            } else {
                //System.out.println("False");
                //System.out.println("adding: "+logs[i]);
                a2.add(logs[i]);
            }
        }
        Collections.sort(a1);
        int i=0;
        for(String c:a1) {
            String b[]=c.split(",");
            String k=b[1]+ " " + b[0].trim();
            a[i++]=k;
        }
        for(String c:a2) {
            //System.out.println("Here:"+c);
            a[i++]=c;
        }
    return a;
    }
}
