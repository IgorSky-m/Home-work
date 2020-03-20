package edu.academy;
// Полиморфизм??

public class CalculatorWIthCounterEx {
    private static int countOperation;
    ParentCalculator calc;
    public CalculatorWIthCounterEx (ParentCalculator calc) {
        this. calc = calc;
    }
    public double summ(double a, double b) {
       countOperation ++;
       return calc.summ(a,b);

    }

    public double sub(double a, double b) {
        countOperation ++;
        return calc.sub(a,b);

    }

    public double mult(double a, double b) {
        countOperation ++;
        return calc.mult(a,b);

    }

    public double div(double a, double b) {
        countOperation ++;
        return calc.div(a,b);


    }

    public double pow(double a, int b) {
        countOperation ++;
        return calc.pow(a,b);

    }

    public double abs (double a) {
        countOperation ++;
        return calc.abs(a);

    }


    public double sqrt(double a) {
        countOperation ++;
        return calc.sqrt(a);

    }

    public static int getCountOperation () {
        return countOperation;
    }


}
