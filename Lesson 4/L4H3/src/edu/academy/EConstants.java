package edu.academy;

public enum EConstants {
    PI(3.14), E(2.72), NULL(0),TEST(17.04);


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

    public static int getNameLength (EConstants constants) {
        return (constants.name().length());
    }

    public static EConstants validateConst (String str) {
        String string=str;
        boolean bug = false;
        for (EConstants constans: EConstants.values()) {
            bug = false;
            String nameConst = constans.name();
            if ((str.substring(0,str.length())).length() < nameConst.length()) {
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
        return bug == false ? EConstants.valueOfIgnoredCase(string) : PI ;

    }


    public double constValueReturn (String str) {
        switch (str) {
            case "PI":
                return PI.constValue;
            case "E":
                return E.constValue;
            default:
                return 0;
        }
    }
}
