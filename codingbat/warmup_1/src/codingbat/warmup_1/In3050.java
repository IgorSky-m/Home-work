package codingbat.warmup_1;

public class In3050 {
    public boolean in3050 (int a, int b) {
        if (((40 -a) <=10 && (40-a) >=0 ) && ((40 -b) <=10 && (40-b) >=0 ) ||
           ((50 -a) <=10 && (50-a) >=0 ) && ((50 -b) <=10 && (50-b) >=0 )) {
            return true;
        } else return false;

    }
}
