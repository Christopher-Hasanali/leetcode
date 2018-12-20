package problems;

import java.util.Stack;

public class Calculator {
    public void calculateNPrint() {
        int years=3,currentYear=2019;
        int months=12,month=1;
        int sum=40000,nsum=0;
        for(int i=0;i<years;i++) {
            for(int j=0;j<months;j++) {
                nsum = (int)(sum*(1+0.1));
                System.out.println("month:"+j+" year:"+(currentYear+i)+" value:"+nsum);
                sum=nsum;
            }
            sum+=25000;
        }
    }
}
