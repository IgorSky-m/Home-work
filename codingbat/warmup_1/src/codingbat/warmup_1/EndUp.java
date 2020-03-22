package codingbat.warmup_1;

public class EndUp {
    public String endUp (String str, int num) {
        int symbolLenght = str.length() > num ? str.length() : num;
        String beginString = String.valueOf(str.substring(0, str.length()-num));
        String endString = String.valueOf(str.substring((str.length())-num,str.length()));

        return beginString + endString.toUpperCase() ;
    }
}
