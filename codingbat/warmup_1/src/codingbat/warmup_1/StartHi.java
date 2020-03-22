package codingbat.warmup_1;

public class StartHi {
    public boolean startHi (String str) {
        String[] string = str.split(" ");

        return String.valueOf(string[0]).equalsIgnoreCase("hi") ? true :false;
    }
}
