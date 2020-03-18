package edu.academy;


public class CalculatorWithOperator {
    private double resultExp = 1;
    private double resultAbs;
    private double resultSqrt;

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


    public double sqrt(double a) {
        double minNum = 0;
        double maxNum = a;
        double centerNum;
        resultSqrt =0;
        while (resultSqrt*resultSqrt != a) {
            centerNum = (maxNum +minNum) / 2;
            if (centerNum*centerNum > a) {
                maxNum = centerNum;
            } else if (centerNum*centerNum < a) {
                minNum = centerNum;
            } else {
                resultSqrt = centerNum;
                break;
            }
        }

        return resultSqrt;
    }








}
