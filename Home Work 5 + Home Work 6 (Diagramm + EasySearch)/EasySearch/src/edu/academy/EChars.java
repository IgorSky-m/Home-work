package edu.academy;

public enum EChars {
    DOT('.'), SPACE(' '), COMMA(','), COLON(':'), SEMICOLON(';'), QUOTES('"'), QUESTION('?'), QUOTE('\'' );
    private char symbol;

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    EChars (char symbol) {
        this.symbol = symbol;
    }

    public static boolean itsChar (char symbol) {
        for (EChars sym: EChars.values()) {
            if (sym.getSymbol() == symbol) {
                return true;
            }
        }
        return false;
    }
}
