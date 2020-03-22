package codingbat.warmup_1;

public class LoneTeen {
    public boolean loneTeen (int a, int b){
        if ((13 <= a && a <= 19) && !(13 <= b && b <= 19) || !(13 <= a && a <= 19) && (13 <= b && b <= 19)){
            return true;
        } else return false;
    }
}
