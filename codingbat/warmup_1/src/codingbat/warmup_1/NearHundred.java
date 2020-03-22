package codingbat.warmup_1;

public class NearHundred {
    int a;
    public boolean nearHundred(int n) {
        if (n > 110) {
            a = Math.abs(200 - n);
        } else
            a = Math.abs(100-n);
        return a <= 10 ? true : false ;
    }
}
