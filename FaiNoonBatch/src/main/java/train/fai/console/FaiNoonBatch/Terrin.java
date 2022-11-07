package train.fai.console.FaiNoonBatch;

import java.util.Arrays;

public class Terrin {
    private double[] thin={9.3,12.5,8.5,4.5,23.5,67.8,34.7,4.1};

    public void view(){
        System.out.println(Arrays.toString(thin));
    }

    protected double findMax(){
        double max=thin[0];
        for(int index=0;index<thin.length;index++){
            if(max<thin[index]){
                max=thin[index];
            }
        }
        return max;
    }

    void differ(){
        for(int bubble=0;bubble<thin.length-1;bubble++){
            System.out.println(thin[bubble]-thin[bubble+1]);
        }
    }

    public final void fibo(){
        System.out.println(thin[0]);
        System.out.println(thin[1]);
        int m1=0,m2=1,sum=0;
        for(int pos=2;pos<thin.length;pos++){
            sum=m1+m2;
            m1=m2;
            m2=sum;
            if(sum<thin.length)
                System.out.println(thin[sum]);
        }
    }
}
