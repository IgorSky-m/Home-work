package codingbat.warmup_1;

public class Max1020 {
    public int max1020 (int a, int b) {
        int rezA = 20 -a, rezB = 20-b;
        if ((rezA >= 0 && rezA <= 10) && (rezB >=0 && rezB <=10 ) ) {
            return a > b ? a:b ;
        } else if (!(rezA >= 0 && rezA <= 10) && !(rezB>=0 && rezB <=10 ) ) {
            return 0;
        } else  if ((rezA >= 0 && rezA <= 10) && !(rezB >=0 && rezB <=10 ) ) {
            return a;
        } else return b;

    }
}
