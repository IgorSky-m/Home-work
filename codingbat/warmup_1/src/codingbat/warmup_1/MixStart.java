package codingbat.warmup_1;

public class MixStart {

    public boolean mixStart (String str) {
        String searchString = "ix";
        int stringIndexOf = str.indexOf(searchString);
        if (stringIndexOf >=0) {
            return true;
        } else return false;

    }
}
