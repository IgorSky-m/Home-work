package codingbat.warmup_1;

public class IcyHot {
    public boolean icyHot (int tempA, int tempB) {
        if (tempA < 0 && tempB > 100 || tempA > 100 && tempB < 0 ) {
            return true;
        } else return false;
    }
}
