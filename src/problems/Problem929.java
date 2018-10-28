package problems;

import java.util.HashMap;
import java.util.Map;

public class Problem929 {

    public int numUniqueEmails(String[] emails) {
        String []names = new String[2];
        Map<String,Integer> emailsCount = new HashMap();
        for(String name:emails) {
            names = name.split("@");
            String a=names[0];
            String []b=a.split("\\+");
            String withOutPlus = b[0];
            String withOutDot = withOutPlus.replace(".","");
            emailsCount.put(withOutDot+names[1],1);
        }
        return  emailsCount.size();
    }
}
