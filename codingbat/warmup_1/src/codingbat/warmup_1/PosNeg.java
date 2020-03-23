package codingbat.warmup_1;

public class PosNeg {
    public boolean posNeg (int a, int b, boolean neg) {
        if (neg == true) {
            return a <0 && b <0 ? true : false;
        } else {
            return (a<0 && b>0) || (b<0 && a>0) ? true : false;
        }
    }
}


