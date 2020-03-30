package edu.academy;

public enum ENumbers {
    ZERO('0',"0"),ONE('1',"1"),TWO('2',"2"),THREE('3',"3"),FOUR('4',"4"),FIVE('5',"5"),SIX('6',"6"),SEVEN('7',"7"),EIGHT('8',"8"),NINE('9',"9"),POINT('.',".");

    private final char numberValue;
    private final String stringValue;
    ENumbers (char numberValue, String stringValue) {
        this.numberValue = numberValue;
        this.stringValue = stringValue;
    }



    public char getNumberValue () {
        return numberValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public static ENumbers valueOfIgnoreCase (String str) {
        return valueOf(str.toUpperCase());
    }


    public static String validNumber (String str) {
        boolean itsFirstNumber = true;
        String resultString="", workString;
        ENumbers number;
        int counter=0;

        for (int i = 0; i <str.length() ; i++) {
            workString = Character.toString(str.charAt(i));
            switch (workString) {// Костыль
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    resultString = resultString.concat(workString);
                    itsFirstNumber = false;
                    break;
                case ".":
                    if(itsFirstNumber==true) {
                        return "";
                    } else {
                        if (counter>0) {
                            return "";
                        } else {
                            resultString = resultString.concat(workString);
                            counter++;
                            break;
                        }
                    }

                case "0":
                    if (itsFirstNumber == true) {
                        return "";
                    } else {
                        resultString = resultString.concat(workString);
                        break;
                    }

                default:
                    if (resultString.length() >0) {
                        return resultString;
                    } else return "";
            }
          }
           return resultString;
    }

}
