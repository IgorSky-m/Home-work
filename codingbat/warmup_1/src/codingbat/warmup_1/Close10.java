package codingbat.warmup_1;

public class Close10 {
    public int close10 (int a, int b) {
        if ((a+b) % 10 != 0) {
            return (a > b) ? b : a ;
        } else return 0;
    }
}
