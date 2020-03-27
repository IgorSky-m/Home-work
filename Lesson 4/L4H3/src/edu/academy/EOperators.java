package edu.academy;

public enum EOperators {
    PLUS("+", 6), MINUS("-",6),MULTIPLICATION("*",5),
    DIVISION("/",5),POWER("^",4),AND("&",10),
    DOUBLE_AND("&&",10), OR("|",12),DOUBLE_OR("||",12),
    PARENTHESES_OPEN("(",2),PARENTHESES_CLOSE(")",2);

    String operationSymbol;
    private int priority;
    EOperators (String operationSymbol, int priority) {
        this.operationSymbol = operationSymbol;
        this.priority = priority;
    }

    public int getPriority () {
        return priority;
    }

    public static int getPriorityWithSymbol (String str) {
        for (EOperators operator:EOperators.values()) {
            if (str.equals(operator.operationSymbol)) {
                return operator.priority;
            }
        }
        return 0;
    }

    public String getOperationSymbol () {
        return operationSymbol;
    }

    public static String validSymbol (String str) {
        String workString ="";
        for (EOperators operator: EOperators.values()) {
            if (Character.toString(str.charAt(0)).equals(operator.operationSymbol)) {
                workString = workString+ str.charAt(0);

                break;
            }
        }

        return workString;
    }

}
