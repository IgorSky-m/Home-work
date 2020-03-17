package edu.academy;


public class CalculatorWithOperator {
    private double resultExp = 1;
    private double resultAbs;

    public double calcSumm(double a, double b) {
        double result = a + b;
        return result;
    }
    public double calcSub(double a, double b) {
        double result = a - b;
        return result;
    }
    public double calcMult(double a, double b) {
        double result = a * b;
        return result;
    }
    public double calcDiv(double a, double b) {
        double result = a / b;
        return result;
    }

    public double calcExp(double a, int b) {
        int i = 0;

        while (i < b) {
            resultExp *= a;
            i++;
        }
        return resultExp;
    }

    public double calcAbs (double a) {
        if (a < 0){
            resultAbs = a*(-1);
        } else {
            resultAbs = a;
        }
        return resultAbs;
    }








}
