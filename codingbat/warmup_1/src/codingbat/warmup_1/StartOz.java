package codingbat.warmup_1;

public class StartOz {
    public String startOz (String str, String searchWord) {
        String resultString = "", stringChar, searchChar;
        for (int i = 0; i <searchWord.length(); i++) {
            stringChar = String.valueOf(str.charAt(i));
            searchChar = String.valueOf(searchWord.charAt(i));
            if (stringChar.equals(searchChar)) {
                resultString = resultString.concat(stringChar);
            }

        }

        return resultString;
    }
}
