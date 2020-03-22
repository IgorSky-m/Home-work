package codingbat.warmup_1;

public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        if ((13 <= a && a <= 19) && (13 <= b && b <= 19) && (13 <= c && c <= 19 )) {
            return true;
        } else return false;

    }
}
