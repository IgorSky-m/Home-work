package edu.academy;


public class CalculatorWithOperator {

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
        double resultPow = 1;
        int i = 0;
        while (i < b) {
            resultPow *= a;
            i++;
        }
        return resultPow;
    }

    public double abs (double a) {
        double resultAbs;
        if (a < 0){
            resultAbs = a*(-1);
        } else {
            resultAbs = a;
        }
        return resultAbs;
    }


    public double sqrt(double a) {
        double resultSqrt;
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
