package edu.academy;

public enum EAlphabet {
    A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
    // Идея такая, присвоить каждой букве ее порядковый номер и написать бинарный поиск для оптимизации поиска

    public static EAlphabet valueOfIgnoreCase (String str) {
        return valueOf(str.toUpperCase());
    }


    public static String validString (String str) {
        int i = 0;
        boolean bug = false;
        String resultString = "";
        for (EAlphabet alphabet: EAlphabet.values()) {
            bug = false;

            try {
                EAlphabet.valueOfIgnoreCase(Character.toString(str.charAt(i)));
            } catch (IllegalArgumentException e) {
                bug = true;
                break;
            }
            if (bug == false) {
                resultString = resultString +str.charAt(i);
            }
            if (i< str.length()-1) {
                i++;
            } else return resultString;
        }

        return resultString;
    }


}
