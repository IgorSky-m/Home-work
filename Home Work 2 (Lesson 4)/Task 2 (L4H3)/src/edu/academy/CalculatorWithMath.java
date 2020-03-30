package edu.academy;

public class CalculatorWithMath extends ParentCalculator implements ICalc{


    public double summ(double a, double b) {
        double result = a + b;
        return result;
    }

    public double sub(double a, double b) {
        double result = a - b;
        return result;
    }

    public double mult(double a, double b) {
        double result = a * b;
        return result;
    }

    public double div(double a, double b) {
        double result = a / b;
        return result;
    }

    public double pow(double a, int b) {
        double result = Math.pow(a, b);
        return result;
    }

    public double abs (double a) {
        double result = Math.abs(a);
        return result;
    }


    public double sqrt(double a) {
        double result = Math.sqrt(a);
        return result;
    }
}
