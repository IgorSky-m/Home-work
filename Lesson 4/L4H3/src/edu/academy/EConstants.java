package edu.academy;

public enum EConstants {
    PI(3.14), E(2.72),TEST_CONST(17.04), NO_CONST(0);


    private double constValue;

    EConstants (double constValue) {
        this.constValue = constValue;
    }

    public double getConstValue () {
        return constValue;
    }

    public static EConstants valueOfIgnoredCase (String str) {
        return valueOf(str.toUpperCase());
    }



    public static EConstants validateConst (String str) {
        String string=str;
        boolean bug = false;
        for (EConstants constans: EConstants.values()) {
            bug = false;
            String nameConst = constans.name();
            if ((str.substring(0,str.length())).length() < nameConst.length()) {
                bug = true;
                continue;
            }
            string = str.substring(0,nameConst.length());
           try {
               EConstants.valueOfIgnoredCase(string);
           } catch (IllegalArgumentException e) {
               bug = true;
               continue;
           }

           if (bug == false) break;
        }
        return bug == false ? EConstants.valueOfIgnoredCase(string) : NO_CONST ;

    }

    public static EConstants validateConstant (String str) {
        String resultString ="";
        boolean bug = false;
        for (EConstants constant: EConstants.values()) {
            bug = false;
            if (str.length() < constant.name().length()) {
                bug = true;
                continue;
            }
            try {
                EConstants.valueOfIgnoredCase(str);
            } catch (IllegalArgumentException e) {
                bug = true;
                continue;
            }
            if (bug == false) {
                return constant;
            }
        }

        return NO_CONST;
    }

}
