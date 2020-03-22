package codingbat.warmup_1;

public class ParrotTrouble {
    public boolean parrotTrouble (boolean talk, int hour) {
        if (talk == true && (hour <=7 || hour >=20)) {
            return true;
        } else return false;
    }
}
