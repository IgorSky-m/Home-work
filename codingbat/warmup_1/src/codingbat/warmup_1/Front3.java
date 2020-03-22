package codingbat.warmup_1;

public class Front3 {
    public String front3 (String str,int frontNum) {
        String frontString ="", result ="";
        for (int i = 0; i <frontNum ; i++) {
            frontString += String.valueOf(str.charAt(i));
        }
        for (int i = 0; i <frontNum ; i++) {
            result +=frontString;
        }
        return result;
    }
}
