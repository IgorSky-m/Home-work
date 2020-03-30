package edu.academy;

public class CalculatorWithCounter {

    private CalculatorWithMath calcWithMath;
    private CalculatorWithOperator calcWithOperator;
    private static int countOperation;

    public CalculatorWithCounter(CalculatorWithOperator a){
        this.calcWithOperator = a;
    }
    public CalculatorWithCounter (CalculatorWithMath a){
        this.calcWithMath = a;
    }
    public double summ(double a, double b) {
        this.countOperation ++;
        return (calcWithMath != null  ? calcWithMath.summ(a,b): calcWithOperator.summ(a,b));

    }

    public double sub(double a, double b) {
        this.countOperation ++;
        return (calcWithMath != null  ? calcWithMath.sub(a,b): calcWithOperator.sub(a,b));

    }

    public double mult(double a, double b) {
        this.countOperation ++;
        return (calcWithMath != null  ? calcWithMath.mult(a,b): calcWithOperator.mult(a,b));

    }

    public double div(double a, double b) {
        this.countOperation ++;
        return (calcWithMath != null  ? calcWithMath.div(a,b): calcWithOperator.div(a,b));

    }

    public double pow(double a, int b) {
        this.countOperation ++;
        return (calcWithMath != null  ? calcWithMath.pow(a,b): calcWithOperator.pow(a,b));
    }

    public double abs (double a) {
        this.countOperation ++;
        return (calcWithMath != null  ? calcWithMath.abs(a): calcWithOperator.abs(a));
    }


    public double sqrt(double a) {
        this.countOperation ++;
        return (calcWithMath != null  ? calcWithMath.sqrt(a): calcWithOperator.sqrt(a));
    }


    public static int getCountOperation () {
        return countOperation;
    }




}
