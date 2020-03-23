package edu.academy;

public class Factorial {
    public int factorial (int a) {
       Factorial factorial = new Factorial();
       int result = a;
            if (result < 1) {
                result =1;
            } else {
                result *=factorial.factorial(a-1);
            }
        return result;
    }
}
